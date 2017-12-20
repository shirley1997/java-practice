public class Main{
		
		
	
	public static void main(String[] args){
		Main count = new Main();
		count.Countdown(5,0);
		count.Numberseries(1,14);
		count.Product(6,11);
		
	
	
	}
	static void Countdown(int n1,int n2){
			
			for(int i = n1; i >= n2; i--){
			System.out.print(i + " ");
		
			}
			System.out.println(" ");
			
		}
		
	static void Numberseries(int n3,int n4){
		for(int i=n3;i<=n4;i++){
		if(i%2 == 1){
		System.out.print(i +" ");
		}
		i++;
		}
		System.out.println(" ");
		
	}
	
	static void Product(int n5,int n6){
		int product = 1;
		int i = n5;
		while(i>=n5 && i<=n6){
		 product *= i;
		i++;
		}
	System.out.println(product);
		
	}



}