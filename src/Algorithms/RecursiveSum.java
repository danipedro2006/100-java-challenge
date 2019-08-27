package Algorithms;

public class RecursiveSum {

	public static void main(String[] args) {
		int n=100;
		
		System.out.println(sum(n));
	}

	private static int sum(int n) {
		if(n<1)
		{
			return 0;
		}
		else
		{
			return n+sum(n-1);
		}
			
			
	}

}
