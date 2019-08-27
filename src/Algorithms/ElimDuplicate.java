package Algorithms;

public class ElimDuplicate {
	static int[] series;

	public static void main(String[] args) {
		int[] series = { 1, 2, 5, 3, 2, 7, 8, 9, 6, 4, 2, 5, 3, 4, 5 };
		elimdup(series);
		disp(series);
	}

	private static void disp(int[] series) {
		for (int i : series) {
			if (i != 0)
				System.out.println(i);
		}
	}

	private static void elimdup(int[] ser) {
		for (int i = 1; i < ser.length; i++) {

			for (int j = i + 1; j < ser.length; j++) {
				if (ser[i] == ser[j])
					ser[j] = 0;
			}
		}
	}

}
