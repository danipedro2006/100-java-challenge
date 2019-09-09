//Java program to check if a given number is a perfect square

package Algorithms;

public class PerfectSquare {

	public static void main(String[] args) {
		
		// the given value is stored in variable number
		int number = 81;
		System.out.println(isPerfectSq(number));
	}
	
	//isPerfectSq(int number) displays true or false depending if the given number is or not perfect square
	private static boolean isPerfectSq(int number) {
		// a given number is perfect square if the remainder, when divided by four is 0 or 1
		if (number % 4 == 0 || number % 4 == 1) {
			
			return true;
		}
		return false;
	}

}
