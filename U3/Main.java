public class Main
{
	
	static int[][] winResults = new int[][] {
		{ 0, 3, 6},
		{ 0, 4, 8},
		{ 0, 1, 2},
		{ 2, 5, 8},
		{ 1, 4, 7},
		{ 2, 4, 6},
		{ 6, 7, 8},
		{ 3, 4, 5}
	};
	
	public static void main(String[] args){
		int[] input = new int[9];
		for (int i = 0; i < 9; i++) {
			input[i] = Integer.parseInt(args[i]);
		}
		
		boolean somebodyWon = false;
		for(int t=1;t<9 ;t++){
			int[] p1 = new int[(t+1)/2];
			int[] p2 = new int[(t)/2];
			for(int i=0;i<t;i++){
				if(i%2 ==0 ){
					p1[i/2] = input[i];
				}
				else {
					p2[(i-1)/2] = input[i];
				}
			}
			if (!somebodyWon) { 
				somebodyWon = checkWin(p1,p2,t);
			}
		}
		if (!somebodyWon) {
			System.out.println("draw");
		}
	}
	
	static boolean checkWin(int[] p1, int[] p2, int t) {
		boolean p1wins = false;
		boolean p2wins = false;
		
		for(int[] winResult : winResults){
			boolean first = false;
			boolean second = false;
			boolean third = false;
			for(int j=0; j < p1.length; j++) {
				if (p1[j] == winResults[0]) { first = true; }
				if (p1[j] == winResults[1]) { second = true; }
				if (p1[j] == winResults[2]) { third = true; }
			}
			if (first && second && third) {
				System.out.println("P1 wins " + t);
				return true;
			}
			
		}
		
		for(int[] winResult : winResults){
			boolean first = false;
			boolean second = false;
			boolean third = false;
			for(int j=0; j < p2.length; j++) {
				if (p2[j] == winResults[0]) { first = true; }
				if (p2[j] == winResults[1]) { second = true; }
				if (p2[j] == winResults[2]) { third = true; }
			}
			if (first && second && third) {
				System.out.println("P2 wins " + t);
				return true;
			}
		}
		return false;
	
	}
}


