class Player {
    String name;
    int current_location;
    Player(String name) {
        this.name = name;
    }
    int getLocation() {
        return current_location;
    }

    void move(int diceValue) {
        current_location += diceValue;
        current_location = Board.checkForSnakesNLadders(current_location);
        System.out.println("current location "+current_location);
        System.out.print("\n");
    }

    boolean isWinner(int finalLocation) {
        if(current_location == finalLocation)
            return true;
        else
            return false;
    }

    boolean isValid(int diceValue, int finalLocation) {
        int temp = current_location + diceValue;
        if(temp <= finalLocation)
            return true;
        else {
            System.out.println("Invalid");
            return false;
        }
    }

    void prompt() {
        System.out.println(name + ", you are at " + current_location);
    }
}
