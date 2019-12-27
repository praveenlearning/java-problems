import java.util.Scanner;
class Player {
    String name;
    int x,y;
    Scanner in = new Scanner(System.in);
    Player(){
    	System.out.println("enter your name ");
       	name = in.nextLine();
        x = 0;
        y = 0;
    }
}