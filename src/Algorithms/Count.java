package Algorithms;

public class Count {
	static int n;
	
	public static void main(String[] args) 
		{
			n=10;
			print1toN(n);
		}
	
	private static void  print1toN(int n)
		{
			if(n==1) 
				{
					System.out.println("Tipareste "+1);
				}
		
		else 
	
				{
				System.out.println("Pune pe stiva "+n);	
				print1toN(n-1);
					System.out.println("Scoate din stiva "+n);
				}
		}
}
	
