class Ball {
    private int x,y;
    Ball() {
        x = (int) (Math.random()*10);
        y = (int) (Math.random()*10);
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}