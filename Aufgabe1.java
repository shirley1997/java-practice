public class Aufgabe1{
	//final int N = 100;
	//final int N;
	//int[] array = new int[N];
	//double average = 0.0;
	public static int arraySum(int[] array){
		//array1 = array;
		int sum = 0;
		for(int i=0;i<array.length;i++){
			sum += array[i];
			
		}
		return sum;
		
	}
	
	
	public static double average(int[] array){
		//array1 = array;
		double sum = 0.0;
		double average = 0.0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
			
		}
		return average = sum/array.length;
		
		
	}

}


