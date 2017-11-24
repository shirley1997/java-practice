import java.util.Scanner;
public class Product{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt(); 
		int i;
		int product = 1;
		for(i=n1; i<=n2; i++){
		product = product * i;
		
		}
		System.out.println(product + " ");
	}



}