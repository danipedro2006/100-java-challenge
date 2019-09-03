package Algorithms;

public class Sudoku {
	int[][] table;

	public Sudoku(int[][] table) {
		this.table = table;
	}

	public static void main(String[] args) {
		int[][] table = { { 1, 4, 0 }, { 4, 1, 3 }, { 3, 0, 9 } };

		display(table);
		// System.out.println(checkRow(table,0));
		// System.out.println(checkCol(table, 0));
		System.out.println(checkTable(table));
	}

	private static boolean checkTable(int[][] table) {

		for (int r = 0; r < table.length; r++) {
			if (checkRow(table, r) == false)
				return false;
		}

		for (int c = 0; c < table.length; c++) {
			if (checkCol(table, c) == false)
				return false;
		}
		return true;
	}

	private static boolean checkRow(int[][] table, int r) {
		for (int col = 0; col < table.length; col++) {
			for (int s = col + 1; s < table.length; s++) {
				if (table[r][col] == table[r][s])
					return false;
			}

		}
		return true;

	}

	private static boolean checkCol(int[][] table, int c) {
		for (int row = 0; row < table.length; row++) {
			for (int s = row + 1; s < table.length; s++) {

				if (table[row][c] == table[s][c])
					return false;

			}

		}
		return true;

	}

	private static void display(int[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}

	}
}
