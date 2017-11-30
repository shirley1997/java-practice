import java.util.Scanner;
public class testen{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int i = n1;
		int product = 1;
		//int a = n1, b = n2;
		while(i>=n1 && i<=n2){
		 product *= i;
		i++;
		}
	System.out.println(product);
	}

}