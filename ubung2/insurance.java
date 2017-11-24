import java.util.Scanner;
public class insurance{
	public static void main(String[] args){
	double VB = 1;
	Scanner scanner=new Scanner(System.in);
	int G = scanner.nextInt();
	int W = scanner.nextInt();
	if((G>0)&&(W>0)){
		VB = G + 0.5*W;
		System.out.println(VB);
		
	}
	//System.out.println(VB);
	
	
	}




}