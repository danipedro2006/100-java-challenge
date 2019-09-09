//Java program to check if a given prime is or not a Sophie prime number
// a prime number is called Sophie prime if can be written as 2*s+1, where s is prime

package Algorithms;

public class SophiePrimes {

	public static void main(String[] args) {
		
		// given number
		int number = 11;
		int sophieNumber = 2 * number + 1;

		System.out.println(isPrime(sophieNumber));

		for (int i = 2; i < 1000; i++) {

			if (isPrime(i) && isPrime(2 * i + 1)) {

				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int number) {

		for (int i = 2; i * i < number; i++) {

			if (number % i == 0)
				return false;
		}
		return true;

	}
}
