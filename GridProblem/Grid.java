class Grid {
    static int gridSize, count;
    Ball ball;
    Player player;
    boolean isReached;
    Grid(int gridSize) {
        this.gridSize = gridSize;
        ball = new Ball();
        player = new Player();
    }

    void start() {
        player.findPathTo(ball);
    }
}