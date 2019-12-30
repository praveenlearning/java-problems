class Grid {
    static int gridSize;
    Ball ball;
    Grid(int gridSize) {
        this.gridSize = gridSize;
        ball = new Ball();
    }
    Ball getBall() {
        return ball;
    }
}