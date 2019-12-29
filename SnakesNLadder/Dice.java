class Dice {
    int value;
    int roll() {
        value = (int)(1 + Math.random()*6);
        return value;
    }
}