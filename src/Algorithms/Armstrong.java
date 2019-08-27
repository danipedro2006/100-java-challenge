package Algorithms;

public class Armstrong {
	
	public static void main(String[] args) {
		int number=153;
		int witness=number;
		int sum=0;
		int remainder=0;
		
		//System.out.println(isArmstrongN(number, witness, sum));
		for(int i=1;i<1000;i++)
		{
			if(isArmstrongN(i,i,0)) System.out.println(i);
		}
	}

	private static boolean isArmstrongN(int number, int witness, int sum) {
		int remainder;
		while(number>0)
			{
				remainder=number%10;
				sum=(int) (sum+Math.pow(remainder, 3));
				number=number/10;
				
			}
			
		if (sum==witness)
		
				return true;
		
			else 
			
				return false;
			
	}
}


