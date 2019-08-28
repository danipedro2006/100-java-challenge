package Algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 7, 9, 7, 5, 4, 9 };
		linSearch(numbers, 3);
		System.out.println(linSearch(numbers, 5));

	}

	private static boolean linSearch(int[] data, int n) {

		for (int i = 0; i < data.length; i++) {
			if (data[i] == n)
				return true;
		}
		return false;
	}
}
