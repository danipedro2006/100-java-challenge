package recursion;

public class DispL {

	public static void main(String[] args) {
		int[] v= {1,3,5,2,3,6,7,9};
		DispL(v, v.length);
	}

	private static void DispL(int[] v, int n) {
		if(n>0)
		{
			
			DispL(v, n-1);
			System.out.print(v[n-1]);
		}
	}

}
