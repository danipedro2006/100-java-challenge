package Algorithms;

public class BinC {

	public static void main(String[] args) {
		System.out.println(ck(6,2));
	}

	private static int ck(int n, int k) {
		if(n==k)
		{
			return 1;
		}
		if(n==0)
		{
			return 0;
		}
		if(k==0)
		{
			return 1;
		}
		else
		{
			return ck(n-1,k-1)+ck(n-1,k);
		}
	}

}
