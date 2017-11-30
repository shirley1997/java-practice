public class insurance{
	public static void main(String[] args){
	double VB = 1;
	
	int G = Integer.parseInt(args[0]);
	int W = Integer.parseInt(args[1]);
	if((G>0)&&(W>0)){
		VB = G + 0.5*W;
		System.out.println(VB);
		
	}
	//System.out.println(VB);
	
	
	}




}