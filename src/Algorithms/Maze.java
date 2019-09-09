//Maze problem
//Java code to find the maze exit path using a backtracking algorithm

package Algorithms;

class Maze {

	private int[][] mazeTable;
	private int[][] solutionTable;
	private int mazeSize;

	public Maze(int[][] mazeTable) {

		this.mazeTable = mazeTable;
		this.mazeSize = mazeTable.length;
		this.solutionTable = new int[this.mazeSize][this.mazeSize];
	}

	public void printTable() {
		for (int i = 0; i < mazeSize; i++) {
			for (int j = 0; j < mazeSize; j++) {
				if (solutionTable[i][j] == 1) {
					System.out.print("*" + " ");
				} else {
					System.out.print("-" + " ");
				}
			}
			System.out.println();
		}
	}

	public void solveMaze() {
		if (solve(0, 0)) {

			printTable();
		} else {

			System.out.println("There is no solution...");
			return;

		}
	}

	//find solution using a backtracking algorithm
	private boolean solve(int x, int y) {

		if (isFinished(x, y)) {
			return true;
		}

		if (isValid(x, y)) {
			solutionTable[x][y] = 1;
			if (solve(x + 1, y)) {
				return true;
			}
			if (solve(x, y + 1)) {
				return true;
			}
			//backtrack
			solutionTable[x][y] = 0;
		}

		return false;
	}
	
	
//check if solution is a valid solution
	private boolean isValid(int x, int y) {
		if (x < 0 || x >= mazeSize)
			return false;
		if (y < 0 || y >= mazeSize)
			return false;
		if (mazeTable[x][y] != 1)
			return false;
		return true;
	}

	private boolean isFinished(int x, int y) {
		if (x == mazeSize - 1 && y == mazeSize - 1) {
			solutionTable[x][y] = 1;
			return true;
		}
		return false;
	}

}

// main class
//variable table sore the maze  in binary representation 
class MazeApp {

	public static void main(String[] args) {
		int[][] table = { { 1, 1, 0, 1 }, { 0, 1, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 } };
		Maze maze = new Maze(table);
		maze.solveMaze();
	}
}