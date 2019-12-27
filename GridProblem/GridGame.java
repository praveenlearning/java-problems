class GridGame{
	int x_co = 0,y_co = 0;
	private int ball_x,ball_y;
	int x_max = 10,x_min = 0,y_max = 10,y_min = 0;
	private int count = 0;

	public GridGame(){
		ball_x = x_min + (int) (Math.random()*(x_max-x_min+1));
		ball_y = y_min + (int) (Math.random()*(y_max-y_min+1));
	}
	public void start(){
		System.out.println("\n\nBall position is ("+ball_x+","+ball_y+")");
		System.out.println("You are ready to start the game.....\n");
		
		System.out.print("("+x_co+","+y_co+")");
		while(x_co!=ball_x || y_co!=ball_y){
			
			
			if(x_co<ball_x){
				System.out.print(" --> ");
				x_co++;
				count++;
				System.out.print("("+x_co+","+y_co+")");
			}
			
			if(y_co<ball_y){
				System.out.print(" --> ");
				y_co++;
				count++;
				System.out.print("("+x_co+","+y_co+")");
			}
			
		}
		System.out.println("\nYeah...\nYou reached the ball in "+count+" steps");
	}
}
