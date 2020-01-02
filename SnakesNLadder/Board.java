import java.util.HashMap;
import java.util.Map;
class Board {
    static HashMap<Integer, Integer> snakes = new HashMap<>();
    static HashMap<Integer, Integer> ladders = new HashMap<>();

    Board() {
        snakes.put(99,21);
        snakes.put(95,75);
        snakes.put(93,89);
        snakes.put(78,25);
        snakes.put(52,28);
        snakes.put(16,8);

        ladders.put(2,45);
        ladders.put(4,27);
        ladders.put(9,31);
        ladders.put(47,84);
        ladders.put(70,87);
        ladders.put(71,91);
    }

    static int checkForSnakesNLadders(int playerLocation) {
        if(snakes.containsKey(playerLocation)) {
            System.out.println("OOPS...Snake bite to "+snakes.get(playerLocation));
            return snakes.get(playerLocation);
        }

        else if(ladders.containsKey(playerLocation)) {
            System.out.println("YEAH....Ladder to "+ladders.get(playerLocation));
            return ladders.get(playerLocation);
        }
        else
            return playerLocation;
    }
}