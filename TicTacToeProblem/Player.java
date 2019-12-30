import java.util.Scanner;
public class Player {
    String name,sign;
    Scanner in = new Scanner(System.in);
    Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
        //System.out.println(name+""+sign);
    }
    void mark(Grid grid) {
        int x,y;
        grid.showBox();
        boolean flag = false;
        while(flag==false) {
            System.out.println(name+" enter box location");
            x = in.nextInt();
            y = in.nextInt();
            flag = grid.fillBox(x, y, sign);
        }
    }
}