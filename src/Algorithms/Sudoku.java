package Algorithms;

public class Sudoku {
	public static final int BOARD_SIZE=9;
	public static final int BOX_SIZE=3;
	public static final int MIN_NUMBER=1;
	public static final int MAX_NUMBER=9;

	int[][] table;

	public Sudoku(int[][] table) {
		this.table = table;
	}

	public static void main(String[] args) {

		int[][] table = { { 3, 0, 6, 0, 0, 8, 4, 0, 0 }, { 5, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 0, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		Sudoku sudoku = new Sudoku(table);

		sudoku.display(table);
		System.out.println("");
		System.out.println("Solved");
		System.out.println("===========================");
		sudoku.solveProblem();

	}

	private void solveProblem() {
		if (!solve(0, 0)) {
			System.out.println("No solution");
		} else {
			display(table);

		}

	}

	boolean valid(int col, int row, int numbers) {
		for (int i = 0; i <BOARD_SIZE; ++i)
			if (table[i][row] == numbers)
				return false;

		for (int k = 0; k <BOARD_SIZE; ++k)
			if (table[col][k] == numbers)
				return false;

		int roffset = (col / 3) *BOX_SIZE;
		int coffset = (row / 3) *BOX_SIZE;

		for (int i = 0; i < BOX_SIZE; ++i)
			for (int j = 0; j <BOX_SIZE; ++j)
				if (numbers == table[roffset + i][coffset + j])
					return false;

		return true;
	}

	public boolean solve(int rowi, int coli) {

		if (rowi ==BOARD_SIZE && ++coli ==BOARD_SIZE) {
			return true;
		}

		if (rowi == BOARD_SIZE) {
			rowi = 0;
		}

		if (table[rowi][coli] != 0) {
			return solve(rowi + 1, coli);
		}

		for (int number = 1; number <= 9; ++number) {

			if (valid(rowi, coli, number)) {
				table[rowi][coli] = number;

				if (solve(rowi + 1, coli))
					return true;
			}

		}

		table[rowi][coli] = 0;
		return false;
	}

	private void display(int[][] t) {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j <BOARD_SIZE; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}

	}
}

	

