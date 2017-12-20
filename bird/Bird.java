
 class Bird extends Animal{
	 
	 int age;
	 public Bird(int birdsage){
		 age = birdsage;
		 
	 }
	 public void fly(){
		 System.out.println("I am flying!");
		 
	 }
	 public void sing(){
		 System.out.println("I am singing!");
		 
	 }
	public int getAge(){
		return age;
		
	}
public static void main(String[] args){
	Bird bird = new Bird(23);
	bird.walk();
	bird.fly();
	bird.sing();
	int birdage = bird.getAge();
	System.out.println("Your bird is "+ birdage +"yrs old");
	
	
}

}
