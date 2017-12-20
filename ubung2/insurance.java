public class Insurance{
	public static void main(String[] args){
	Insurance insurance1 = new Insurance();
	insurance1.insurance(85,3000);
	}
	
	static void insurance(int G,int W){
		double VB = 1;
		if((G>0)&&(W>0)){
		VB = G + 0.5*W;
		System.out.println(VB);
		
	}
	
	}




}