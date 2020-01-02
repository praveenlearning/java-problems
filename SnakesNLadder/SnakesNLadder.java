import java.util.Scanner;
class SnakesNLadder {
    private boolean hasWinner;
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
        while(hasWinner == false) {
            for (Player player : players) {
                player.prompt();
                System.out.println("press enter to roll dice...");
                in.nextLine();
                diceValue = dice.roll();
                System.out.println(diceValue);
                System.out.println("move "+diceValue+" steps");
                if(player.isValid(diceValue, finalLocation)) {
                    player.move(diceValue);
                }
                if(player.isWinner(finalLocation)) {
                    hasWinner = true;
                    winner = player;
                    break;
                }
                System.out.println("<-->  <-->  <-->\n");
            }
        }
        System.out.println("Total dice rolls : "+dice.diceRolls);
        System.out.println(winner.name+" wins the game");
    }
}