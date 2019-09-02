package Algorithms;

// implement NQeens problem and find solution

public class QeensProblem {
	int[][] table;
	int Nqeens;

	public QeensProblem(int Nqeens) {

		this.table = new int[Nqeens][Nqeens];
		this.Nqeens = Nqeens;
	}

	public void solve() {
		if (setQeens(0)) {
			display();
		} else {
			System.out.println("There is no valid solution...");
		}

	}

	public boolean setQeens(int col) {
		if (col == Nqeens) {
			return true;
		}

		for (int row = 0; row < Nqeens; row++) {

			if (isValid(row, col)) {
				table[row][col] = 1;
				if (setQeens(col + 1)) {
					return true;
				}
				table[row][col] = 0;// backtrack
			}
		}

		return false;

	}

	private boolean isValid(int row, int col) {
		for (int i = 0; i < col; i++) {
			if (table[row][i] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (table[i][j] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i < table.length && j >= 0; i++, j--) {
			if (table[i][i] == 1) {
				return false;
			}
		}

		return true;
	}

	public void display() {

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				if (table[i][j] == 1) {
					System.out.print("*" + " ");
				} else {
					System.out.print("-" + " ");
				}
			}
			System.out.println();
		}

	}
}

class App {
	public static void main(String[] args) {
		QeensProblem problem = new QeensProblem(8);
		// problem.display();
		problem.solve();
	}
}
