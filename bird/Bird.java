
 class Bird extends Animal{
	 
	 public void fly(){
		 System.out.println("I am flying!");
		 
	 }
	 public void sing(){
		 System.out.println("I am singing!");
		 
	 }
	
public static void main(String[] args){
	Bird bird = new Bird();
	bird.walk();
	bird.fly();
	bird.sing();
	
	
}

}
