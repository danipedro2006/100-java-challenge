package recursion;

public class DispO {

	public static void main(String[] args) {
		disp(6);
	}

	private static void disp(int n) {
			if(n==1)
			{
				System.out.print("O");
			}
			else
			{
				
				System.out.print("O");
				disp(n-1);
			}
		}
	}


