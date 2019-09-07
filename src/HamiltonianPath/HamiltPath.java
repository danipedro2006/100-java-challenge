package HamiltonianPath;

public class HamiltPath {
	int numVertices;
	int[] hPath;
	int[][] gMatrix;
	int pLength=gMatrix.length;
	
	public HamiltPath(int[][] gMatrix) {
		this.numVertices=gMatrix[0].length;
		this.gMatrix=gMatrix;
		this.hPath=new int[this.numVertices];
		this.hPath[0]=0;
		if(problemSolved(1)) {
			display(hPath);
		}
			else {
				System.out.println("No feasible solution..");
				return;
			}
		
	}

	private boolean problemSolved(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	private void display(int[] hPath) {
		// TODO Auto-generated method stub
		
	}

	private boolean findPath(int i, int position) {
		
		if(position==hPath.length) {
			if(hPath[position])
		}
		findPath(i+1);
		if(feasible(int vertex, int position)) {
			hPath[vertex]=position;
			return true;
		}
		
		return false;
	}

}
