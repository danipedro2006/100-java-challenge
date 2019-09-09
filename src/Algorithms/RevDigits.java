package recursion;

public class RevDigits {

	public static void main(String[] args) {
		rev(12345);
	}

	private static void rev(int n) {
				
			System.out.print(n%10);
			if(n<10)
			{
				System.out.println();
			}
			else
			{
				
				rev(n/10);
			}
	}

}
