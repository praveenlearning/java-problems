class Ball {
    private int x,y;
    Ball() {
        x = (int) (Math.random()*Grid.gridSize);
        y = (int) (Math.random()*Grid.gridSize);
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}