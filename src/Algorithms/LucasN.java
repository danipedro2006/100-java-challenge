package recursion;

public class LucasN {

	public static void main(String[] args) {
		System.out.println(luc(6));
	}

	private static int luc(int n) {
		if(n==1)
		{
			return 1;
		}
		else if(n==2)
		{
			return 3;
		}
		else
		{
			return luc (n-2)+luc(n-1);
		}
		
	}

}
