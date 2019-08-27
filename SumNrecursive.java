package javacamp;

public class SumNrecursive {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = n.length - 1;
		System.out.println(sum(n, 0));
	}

	private static int sum(int[] n, int i) {
		if (i < 1) {
			return n[i];
		} else {
			return n[i] + sum(n, i - 1);
		}
	}

}
