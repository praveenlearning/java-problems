import java.util.Scanner;
public class TicTacToe {
    Grid g;
    Player winner;
    Player p1,p2;
    Scanner in = new Scanner(System.in);

    TicTacToe() {
        g = new Grid();
        System.out.println("Player1 name : ");
        p1 = new Player(in.next(),"o");
        System.out.println("Playe2 name : ");
        p2 = new Player(in.next(),"x");
    }
    void play() {
        while(isGameAlive()) {
            p1.mark(g);
            if (checkWinner(p1)) {
                winner = p1;
                break;
            }
            p2.mark(g);
            if (checkWinner(p2)) {
                winner = p2;
                break;
            }
        }
        g.showBox();
    }
    boolean checkWinner(Player p) {
        String[][] box = g.box;
        boolean flag = false;
        for(int i=0;i<box.length;i++) {
            flag = flag || (box[i][0]+box[i][1]+box[i][2]).equals(p.sign+p.sign+p.sign) || (box[0][i]+box[1][i]+box[2][i]).equals(p.sign+p.sign+p.sign);
        }
        flag = flag || (box[0][0]+box[1][1]+box[2][2]).equals(p.sign+p.sign+p.sign) || (box[0][2]+box[1][1]+box[2][0]).equals(p.sign+p.sign+p.sign);
        return flag;
    }
    boolean isGameAlive() {
        System.out.println("here 1");
        if(winner==null) {
            System.out.println("here 2");
            if(g.isFull())
                return false;
            else
                return true;
        }
        else
            return false;
    }
}