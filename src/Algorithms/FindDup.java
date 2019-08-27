package Algorithms;

public class FindDup {

	public static void main(String[] args) {
		int[] series = { 1, 2, 5, 3, 2, 7, 8, 9, 6, 4, 2, 5, 3, 4, 5 };
		findDup(series);
	}

	private static void findDup(int[] ser) {
		for (int i = 1; i < ser.length; i++) {
			for (int j = i + 1; j < ser.length; j++) {
				if (ser[i] == ser[j])
					System.out.println(ser[j]);
			}
		}

	}

}
