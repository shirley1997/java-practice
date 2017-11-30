public class Aufgabe11 {

	/** Calculates the sum of the two input integers and prints the result.
	* @param args two integers as only arguments
	*/
	public static void main(String[] args) {
		/* Parse String Input arguments to integers (Only possible because it is promised that only Integers are given as input)
		*/
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);

		// Calculating sum
		int result = number1 + number2;

		// Printing out Result
		System.out.println(result);
	}
}