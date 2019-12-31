import java.util.Scanner;
public class TicTacToe {
    Grid grid;
    Player winner;
    Player player1,player2;
    Scanner in = new Scanner(System.in);

    TicTacToe() {
        grid = new Grid();
        System.out.println("Player1 name : ");
        player1 = new Player(in.next(),"o");
        System.out.println("Playe2 name : ");
        player2 = new Player(in.next(),"x");
    }
    void play() {
        while(isGameAlive()) {
            player1.mark(grid);
            if (checkWinner(player1)) {
                winner = player1;
                break;
            }
            player2.mark(grid);
            if (checkWinner(player2)) {
                winner = player2;
                break;
            }
        }
        grid.showBox();
    }
    boolean checkWinner(Player player) {
        String[][] box = grid.box;
        boolean flag = false;
        for(int i=0;i<box.length;i++) {
            flag = verticalCheck(i, player.sign) || horizontalCheck(i, player.sign);
        }
        flag = flag || diagonalCheck(player.sign);
        return flag;
    }
    boolean isGameAlive() {
        if(winner == null) {
            if(grid.isFull())
                return false;
            else
                return true;
        }
        else
            return false;
    }

    boolean verticalCheck(int column, String sign) {
        String check = "";
        for(int i=0;i<Grid.box.length;i++)
            check += Grid.box[i][column];
            return check.equals(sign+sign+sign);
    }

    boolean horizontalCheck(int row, String sign) {
        String check = "";
        for(int i=0;i<Grid.box.length;i++)
            check += Grid.box[row][i];
        return check.equals(sign+sign+sign);
    }

    boolean diagonalCheck(String sign) {
        String check = "";
        boolean flag;
        for(int i=0;i<Grid.box.length;i++)
            check += Grid.box[i][i];
        flag = check.equals(sign+sign+sign);
        for(int i=0;i<Grid.box.length;i++)
            check += Grid.box[i][Grid.box.length-i-1];
        flag = flag || check.equals(sign+sign+sign);
        return flag;
    }
}