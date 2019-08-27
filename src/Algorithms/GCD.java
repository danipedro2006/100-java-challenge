package Algorithms;

public class GCD {

	public static void main(String[] args) {
		int a = 124, b = 56;
		gcd(a, b);
	}

	private static void gcd(int a, int b) {
		if (a % b == 0) {
			System.out.println(b);
		} else {
			gcd(b, a % b);
		}
	}

}
