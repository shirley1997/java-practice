public class Point{
	private int x;
	private int y;
	
	public Point(){
		x = 0;
		y = 0;
		
	}
	public Point(int x,int y){
		this.x = x;
		this.y = y;
		
		
	}
	public Point(Point p){
		this(p.x,p.y);
		
	}



}