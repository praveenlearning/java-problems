import java.util.*;
class MineSweeper {
    MineField mineField;
    boolean hasWinner;
    Scanner in = new Scanner(System.in);
    Player player;
    MineSweeper() {
        System.out.println("enter minefield size");
        mineField = new MineField(in.nextInt());
        player = new Player();
    }
    void play() {
        while(hasWinner == false ) {
            mineField.showMineField();

            player.choose(mineField);
            if(mineField.openedMine)
                break;
            hasWinner = mineField.check();
        }
        if(hasWinner) {
            mineField.showMineField();
            System.out.println("Wow, you cleared the minefield ! Game over !");
        }
    }

    public static void main(String[] args) {
        MineSweeper game = new MineSweeper();
        game.play();

    }
}