public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
        System.out.println("Player "+game.winner.name+" wins");
    }
}