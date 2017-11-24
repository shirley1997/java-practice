import java.util.Scanner;
public class Numberseries{
	public static void main(String[] args){
		int i;
		Scanner scanner=new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		for(i=n1;i<=n2;i++){
		if(i%2 == 1){
		System.out.println(i +" ");
		}
		i++;
		}
		
	
	
	}




}