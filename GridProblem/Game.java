class Game{
	Player p;
	Grid grid;
	Ball b;
	int count = 0;
	Game() {
		p = new Player();
		grid = new Grid();
		b = grid.getBall();
	}

	void start() {
		while(p.x!=b.getX() || p.y!=b.getY()) {
			if(p.x<b.getX()){
				move("right");
			}
			if(p.y<b.getY()){
				move("up");
			}
		}
		System.out.println("ball position ("+b.getX()+","+b.getY()+")");
		System.out.println("reached ball in "+count+" steps");
		System.out.println(p.name+" completed game");
	}

	void move(String cmd) {
		if(cmd == "right"){
			p.x = p.x + 1;
		}
		else if(cmd == "up") {
			p.y = p.y + 1;
		}
		count += 1;
	}
}
