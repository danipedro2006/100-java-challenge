package Algorithms;

public class SumN {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(sum(n));
	}

	private static int sum(int[] n) {
		int s = 0;
		for (int i = 0; i < n.length; i++) {
			s += n[i];
		}
		return s;
	}

}
