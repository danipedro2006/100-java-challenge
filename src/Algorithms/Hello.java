package recursion;

public class Hello {

	public static void main(String[] args) {
		hello(10);
	}

	private static void hello(int n) {
		if(n==1)
		{
			System.out.println("hello");
		}
		else
		{
			hello(n-1);
			System.out.println("hello");
		}
	}

}
