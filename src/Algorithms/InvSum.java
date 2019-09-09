package recursion;

public class InvSum {

	public static void main(String[] args) {
		System.out.println(inv(10));
	}

	private static double inv(int n) {
		if(n==1)
		{
			return 1.0;
		}
		else
		{
			return (double) (1.0/n+inv(n-1));
		}
	}

}
