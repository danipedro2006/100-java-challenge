package recursion;

public class InvFact {

	public static void main(String[] args) {
		System.out.println(iFact(4));
	}

	private static double iFact(int n) 
	{
		if(n==1) 
		{
			return 1.0;
			
		}
		else
		{
			return ((n-1)/iFact(n-1)); 
		}
	}

}
