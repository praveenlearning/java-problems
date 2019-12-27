public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.play();
        System.out.println("Player "+t.winner.name+" wins");
    }
}