import java.util.Scanner;
class SnakesNLadder {
    Dice dice;
    Board board;
    Scanner in = new Scanner(System.in);
    Player winner;
    int diceValue;
    Player[] players = new Player[2];
    final int finalLocation = 100;
    public SnakesNLadder() {
        dice = new Dice();
        board = new Board();
        players[0] = new Player("Tony");
        players[1] = new Player("Cap");
    }

    void play() {
        while(winner == null) {
            for (Player player : players) {
                System.out.println(player.name + ", you are at " + player.getLocation() + "\npress enter to roll dice...");
                in.nextLine();
                diceValue = dice.roll();
                System.out.println(diceValue);
                while(diceValue%6 == 0) {
                    if(diceValue+player.getLocation()>100) {
                        System.out.println("Exceeds 100");
                        break;
                    }
                    System.out.println("move "+diceValue+" steps");
                    move(diceValue, player);
                    if(isWinner(player))
                        break;
                    System.out.println("you got 6 roll again..");
                    System.out.println("press enter to roll dice...");
                    in.nextLine();
                    diceValue = dice.roll();
                }
                System.out.println("move "+diceValue+" steps");
                move(diceValue, player);
                if(isWinner(player))
                    break;
                System.out.println("<-->  <-->  <-->\n");
            }
        }
        System.out.println("Total dice rolls : "+dice.diceRolls);
        System.out.println(winner.name+" wins the game");
    }

    void move(int diceValue, Player player) {
        if(player.getLocation()+diceValue <= finalLocation)
            player.current_location += diceValue;
        if (board.snakes.get(player.getLocation()) != null) {
            System.out.println("OOPS...Snake bite to "+board.snakes.get(player.getLocation()));
            player.current_location = board.snakes.get(player.getLocation());
        }
        else if (board.ladders.get(player.getLocation()) != null) {
            System.out.println("YEAH....Ladder to "+board.ladders.get(player.getLocation()));
            player.current_location = board.ladders.get(player.getLocation());
        }
        System.out.println("current location "+player.getLocation());
        System.out.print("\n");
    }
    boolean isWinner(Player player) {
        if(player.getLocation() < finalLocation)
            return false;
        else {
            setWinner(player);
            return true;
        }
    }

    void setWinner(Player player) {
        winner = player;
    }
}