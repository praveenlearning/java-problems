class Dice {
    int value, diceRolls;
    int roll() {
        value = (int)(1 + Math.random()*6);
        diceRolls++;
        return value;
    }
}