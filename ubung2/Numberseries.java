public class Numberseries{
	public static void main(String[] args){
		int i;
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		for(i=n1;i<=n2;i++){
		if(i%2 == 1){
		System.out.println(i +" ");
		}
		i++;
		}
		
	
	
	}




}