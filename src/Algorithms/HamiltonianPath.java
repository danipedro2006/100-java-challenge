package HamiltonianPath;

public class HamiltonianPath {

	int numberOfVertices;
	int[] hamiltonianPath;
	int[][] adjacencyMatrix;
	int pathLength;

	public HamiltonianPath(int[][] adjMatrix) {

		this.adjacencyMatrix = adjMatrix;
		this.numberOfVertices = adjMatrix[0].length;
		this.hamiltonianPath = new int[this.numberOfVertices];
		this.pathLength = this.adjacencyMatrix.length;
		this.hamiltonianPath[0] = 0;

		if (findFeasibleSolution(1)) {

			display(hamiltonianPath);
		}

		else {

			System.out.println("No feasible solution...");
		}
	}

	private boolean findFeasibleSolution(int position) {
		if (position == numberOfVertices) {
			if (adjacencyMatrix[hamiltonianPath[position - 1]][hamiltonianPath[0]] == 1) {
				return true;
			} else {

				return false;
			}
		}

		for (int vertexIndex = 1; vertexIndex < numberOfVertices; ++vertexIndex) {
			if (isFeasible(vertexIndex, position)) {
				hamiltonianPath[position] = vertexIndex;

				if (findFeasibleSolution(position + 1)) {
					return true;
				}

			}

		}

		return false;

	}

	private boolean isFeasible(int vertex, int actualPosition) {
		if (this.adjacencyMatrix[this.hamiltonianPath[actualPosition - 1]][vertex] == 0) {
			return false;
		}

		for (int i = 0; i < actualPosition; i++) {
			if (hamiltonianPath[i] == vertex) {
				return false;
			}
		}

		return true;
	}

	private void display(int[] hamilPath) {
		for (int i = 0; i < hamilPath.length; i++) {
			System.out.print(hamilPath[i]);
		}

	}

	public static void main(String[] args) {

		int[][] matrix = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 } };

		HamiltonianPath a = new HamiltonianPath(matrix);

		a.display(a.hamiltonianPath);
	}
}
