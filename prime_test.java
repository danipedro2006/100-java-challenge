package javacamp;

public class prime_test {

	public static void main(String[] args) {
		int n=7;
		System.out.println(isPrime(n));
	}

	private static boolean isPrime(int n) {
		
		for(int i=2;i*i<=n;i++)
			{
			
				if(n%i==0)
					{
						return false;
					}
				
			}
			return true;
	}
}
