import java.util.Scanner;
class SnakesNLadder {
    Dice d;
    Board b;
    Scanner in = new Scanner(System.in);
    Player winner;
    int diceValue;
    Player[] players = new Player[2];
    final int finalLocation = 100;
    public SnakesNLadder() {
        d = new Dice();
        b = new Board();
        players[0] = new Player("java");
        players[1] = new Player("python");
    }

    void play() {
        while(winner == null) {
            for (Player p : players) {
                System.out.println(p.name + ", you are at " + p.getLocation() + "\npress enter to roll dice...");
                in.nextLine();
                diceValue = d.roll();
                System.out.println(diceValue);
                while(diceValue%6 == 0) {
                    System.out.println("you got 6 roll again..");
                    System.out.println("press enter to roll dice...");
                    in.nextLine();
                    diceValue += d.roll();
                }
                System.out.println("move "+diceValue+" steps");
                move(diceValue, p);
                //System.out.println("current location "+p.getLocation());
                if(isWinner(p))
                    break;
            }
        }
        System.out.println("Total dice rolls : "+d.diceRolls);
        System.out.println(winner.name+" wins the game");
    }

    void move(int diceValue, Player p) {
        if(p.getLocation()+diceValue <= finalLocation)
            p.current_location += diceValue;
        if (b.snakes.get(p.getLocation()) != null) {
            System.out.println("OOPS...Snake bite to "+b.snakes.get(p.getLocation()));
            p.current_location = b.snakes.get(p.getLocation());
        }
        else if (b.ladders.get(p.getLocation()) != null) {
            System.out.println("YEAH....Ladder to "+b.ladders.get(p.getLocation()));
            p.current_location = b.ladders.get(p.getLocation());
        }
        System.out.println("current location "+p.getLocation());
        System.out.print("\n");
    }
    boolean isWinner(Player p) {
        if(p.getLocation() < finalLocation)
            return false;
        else {
            setWinner(p);
            return true;
        }
    }

    void setWinner(Player p) {
        winner = p;
    }
}