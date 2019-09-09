package recursion;

public class SqSum {

	public static void main(String[] args) {
		System.out.println(sqsum(3));
	}

	private static int sqsum(int n) {
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (sqsum(n-1)+n*n);
		}
	}

}
