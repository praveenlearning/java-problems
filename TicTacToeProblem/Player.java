import java.util.Scanner;
public class Player {
    String name,sign;
    Scanner in = new Scanner(System.in);
    Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }
    void mark(Grid grid) {
        int x,y;
        grid.showBox();
        boolean marked = false;
        while(marked == false) {
            System.out.println(name+" enter box location");
            x = in.nextInt();
            marked = grid.fillBox(x, sign);
        }
    }
}