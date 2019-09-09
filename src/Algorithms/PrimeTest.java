//Java program to check if a given number is prime

package Algorithms;

public class PrimeTest {

	public static void main(String[] args) {

		// value to be checked is stored in variable number
		int number = 7;
		System.out.println(isPrime(number));
	}

	private static boolean isPrime(int number) {

		for (int i = 2; i * i <= number; i++) {

			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
