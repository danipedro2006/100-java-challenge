package Algorithms;

public class GCDiterative {

	public static void main(String[] args) {
		int a=96,b=34;
		
		gcdit(a,b);
	}

	private static void gcdit(int a, int b) {
		if (a==b || a==0) System.out.println(a);
		
		while(a>0)
			{
				if(a>b)
					{
						a=a-b;
					}
				else
				{
					b=b-a;
				}
			}
			
	}

}
