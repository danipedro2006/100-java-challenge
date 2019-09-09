package recursion;

public class PrintA2N {

	public static void main(String[] args) 
		{
			disp(2);
		}

	private static void disp(int n) {
		if(n==0)
			{
				System.out.print("A");
			}
			
		else
			{
				disp(n-1);
				//disp(n-1);
			}
		}
		
	}


