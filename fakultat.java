import java.util.Scanner;
public class fakultat
  {
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Geben Sie n ein: ");
	int n = scanner.nextInt();
	//int i = 1;
	int sum = 1;
	for(int i=1;i<=n;i++){ //while(i<=n){
		sum *= i;
		//i++;
		
		
	}
	System.out.println(sum);
	}
	}
	
	
	


