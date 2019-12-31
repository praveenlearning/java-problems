class Ball {
    Location ball_location;
    Ball() {
        ball_location = new Location((int) (Math.random()*Grid.gridSize),(int) (Math.random()*Grid.gridSize));
        System.out.print("Ball is at ");
        ball_location.display();
    }
}