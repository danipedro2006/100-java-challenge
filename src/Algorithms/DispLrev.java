package recursion;

public class DispLrev {

	public static void main(String[] args) {
		
		int v[]= {1,4,2,7,8,6,3};
				disp(v,0);
	}

	private static void disp(int[] v, int n) {
		if(n<v.length-1)
		{
			
			disp(v, n+1);
			System.out.print(v[n+1]);
		}
		
	}

}
