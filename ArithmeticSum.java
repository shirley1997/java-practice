class Arithmetic{
	public String getName(){
		return "Arithmetic";
		
	}
	
}

class Adder extends Arithmetic{
	public int add(int a,int b){
		return a+b;
		
	}
	
	
}

public class ArithmeticSum{
	public static void main(String[] args){
		Adder a = new Adder();
		System.out.println("My superclass is: "+a.getClass().getSuperclass().getName());
		System.out.print(a.add(10,10)+" "+a.add(23,22)+" "+a.add(11,13));
		
	}
	
	
}