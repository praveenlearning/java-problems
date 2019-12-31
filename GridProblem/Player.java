import java.util.Scanner;
class Player {
    String name;
    Location location;
    boolean isReached;
    Scanner in = new Scanner(System.in);
    int count;
    Player(){
    	System.out.println("enter your name ");
       	name = in.nextLine();
        location = new Location(0,0);
        System.out.println(name+"\'s starting location ");
        location.display();
    }

    void move(String[] commands) {
        for (String command : commands){
            if(command == "right") {
                location = new Location(location.x + 1, location.y);
                location.display();
                count += 1;
            }
            if(command == "up") {
                location = new Location(location.x,location.y + 1);
                location.display();
                count += 1;
            }

        }
    }

    void findPathTo(Ball ball) {
        while(!isReached) {
            if(location.equals(ball.ball_location)) {
                isReached = true;
                break;
            }

            else {
                String[] commands = location.whereToMove(ball.ball_location);
                move(commands);
            }
        }
        System.out.println(name+" reached ball in "+count+" moves");
    }
}