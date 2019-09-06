package recursion;

public class TR {
	
	public static void f(int n) 
	{
				
		if(n>0)
		f(n-1);
		
		System.out.print(n);
				
	}
			
	public static void main(String[] args) {
		f(5);
		
		
		
	}

}
