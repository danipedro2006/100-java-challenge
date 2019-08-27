package Algorithms;

public class SophiePrimes {

	public static void main(String[] args) {
		int s = 11;
		int sophie = 2 * s + 1;

		System.out.println(isPrime(sophie));

		for (int i = 2; i < 1000; i++) {
			if (isPrime(i) && isPrime(2 * i + 1)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}
}
