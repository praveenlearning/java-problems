class Game{
	Player player;
	Grid grid;
	Ball ball;
	int count = 0;
	Game() {
		player = new Player();
		grid = new Grid(10);
		ball = grid.getBall();
	}

	void start() {
		while(player.x!=ball.getX() || player.y!=ball.getY()) {
			if(player.x<ball.getX()){
				move("right");
			}
			if(player.y<ball.getY()){
				move("up");
			}
		}
		System.out.println("ball position ("+ball.getX()+","+ball.getY()+")");
		System.out.println(player.name+" reached ball in "+count+" steps");
	}

	void move(String command) {
		if(command == "right"){
			player.x++;
		}
		else if(command == "up") {
			player.y++;
		}
		count++;
	}
}