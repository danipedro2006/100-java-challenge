package Algorithms;

public class DecToBaseN {

	public static void main(String[] args) {
		toBaseN(23,3);
	}

	private static void toBaseN(int n, int b) {
		if(n/b==0)
		{
			System.out.print(n%b);
		}
		else
		{
			toBaseN(n/b,b);
			System.out.print(n%b);
		}
	}

}
