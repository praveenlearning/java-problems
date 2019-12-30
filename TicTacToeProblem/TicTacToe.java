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
            flag = flag || (box[i][0]+box[i][1]+box[i][2]).equals(player.sign + player.sign + player.sign) || (box[0][i] + box[1][i] + box[2][i]).equals(player.sign + player.sign + player.sign);
        }
        flag = flag || (box[0][0] + box[1][1] + box[2][2]).equals(player.sign + player.sign + player.sign) || (box[0][2] + box[1][1] + box[2][0]).equals(player.sign + player.sign + player.sign);
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
}