package Algorithms;

public class ReverseInt {

	public static void main(String[] args) {
		System.out.println(reverse(321));

	}

	private static int reverse(int n) {
		int remainder;
		int reversed = 0;
		while (n > 0) {
			remainder = n % 10;
			n = n / 10;
			reversed = reversed * 10 + remainder;
		}
		return reversed;
	}

}
