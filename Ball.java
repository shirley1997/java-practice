class Ball {
float diameter;
int weight;
float xPos;
float yPos;

/*Position(float x,float y){
this.x = x;
this.y = y;*/

Ball(float diameter, int weight , Vector 2D pos){
this.diameter = diameter;
this weight = weight;
this.xPos = pos.x;
this yPos = pos.y;

}

public static void main(String[] args){
	Ball b = new ball(10f,5,new Vector2D(10f,15f));
	System.out.println("My ball: "+b.diameter+" "+b.weight+" "+b.xPos+" "+b.yPos);


}

}
}