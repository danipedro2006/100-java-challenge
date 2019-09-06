package recursion;

public class HR {
	public static void  f(int n) 
	{
		System.out.print(n);
		if(n>0) 
			
			f(n-1);
		
	}
		
	
	public static void main(String[] args) {
		
	f(5);
		
	}

}