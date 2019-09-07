package Algorithms;

public class CubeN {

	public static void main(String[] args) {
		CubeN c=new CubeN();
		System.out.println(c.cube(3));
	}

	private  int cube(int n) {
		if(n==1) {
			return 1;
		}
		else
		{
			return n*n*n+cube(n-1);
		}
	}

}
