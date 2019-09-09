package recursion;

public class SumInvPow {

	public static void main(String[] args) {
		System.out.println(sump(1,3));
	}

	private static double sump(int x, int n) {
		if(n==1)
		{
			return 1;
		}
		else
		{
			return 1.0/(n*Math.pow(x,n))+sump(x, n-1);
		}
			
	}

}
