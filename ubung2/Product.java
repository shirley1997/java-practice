public class Product{
	public static void main(String[] args){
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int i;
		int product = 1;
		for(i=n1; i<=n2; i++){
		product = product * i;
		
		}
		System.out.println(product + " ");
	}



}