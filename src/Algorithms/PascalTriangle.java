//Java program to print the Pascal triangle

package Algorithms;

public class PascalTriangle {

	public static void main(String[] args) {
		int n = 5, k = 2;

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= n; j++) {
				System.out.printf("%- 3d", ncr(i, j));
			}

			System.out.println();
		}
	}

	private static int ncr(int n, int k) {
		int cnk = fact(n) / fact(n - k) / fact(k);
		return cnk;
	}

	private static int fact(int n) {
		int p = 1;
		for (int i = 1; i <= n; i++) {
			p *= i;
		}
		return p;
	}

}
