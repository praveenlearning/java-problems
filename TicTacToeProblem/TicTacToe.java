import java.util.Scanner;
public class TicTacToe {
    Grid grid;
    boolean hasWinner;
    Player player1,player2,winner;
    Scanner in = new Scanner(System.in);

    TicTacToe() {
        grid = new Grid();
        System.out.println("Player1 name : ");
        player1 = new Player(in.next(),"o");
        System.out.println("Playe2 name : ");
        player2 = new Player(in.next(),"x");
    }
    void play() {
        while(hasWinner == false) {
            player1.mark(grid);
            if (checkWinner(player1)) {
                winner = player1;
                hasWinner = true;
                break;
            }
            if(grid.isFull())
                break;
            player2.mark(grid);
            if (checkWinner(player2)) {
                winner = player2;
                hasWinner = true;
                break;
            }
            if(grid.isFull())
                break;
        }
        grid.showBox();
        if(hasWinner) {
            System.out.println("player " + winner.name + " wins");
        } else {
            System.out.println("DRAW");
        }

    }
    boolean checkWinner(Player player) {
        if (grid.verticalCheck()) {
            return true;
        } else if (grid.horizontalCheck()) {
            return true;
        } else if (grid.diagonalCheck()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}