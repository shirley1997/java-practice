public class Aufgabe3{
	public static double[][] sum(double[][] matrixA, double[][] matrixB){
		if(matrixA.length != matrixB.length){
			return null;
			
		}
		else if(matrixA[0].length != matrixB.length){
			
			return null;
		} 
		double[][] sumMatrix = new double[matrixA.length][matrixB.length];
		
		for(int[] i:sumMatrix){
			for(int j: i){
			sumVector[i][j] = vectorA[i][j]+vectorB[i][j];
			
			}
		}
		
		return sumMatrix.length;
		
	}


}