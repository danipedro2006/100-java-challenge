package recursion;

public class Pow {

	public static void main(String[] args) {
		int a=2;
		int n=5;
		System.out.println(pow(a,n));
	}

	private static int pow(int a, int n) {
		if(n==0)
		{
			return 1;
		}
		else
		{
			return a*pow(a,n-1);
		}
	}

}
