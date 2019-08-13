package javacamp;
	
public class sumprimes {
	static int sum=0;
	public static void main(String[] args) {
		int number=342543;
		
		char[] numarray=getdigits(number);
		
		//disp(numarray);
		
		for(int i=0;i<numarray.length;i++)
		{
			if(isPrime(numarray[i])) 
				{
					//sum+=(int)numarray[i];
				System.out.println(numarray[i]);
				}
		}
		
		//System.out.println(sum);
	}
	
	private static void disp(char[] numarray) {
		for(int i=0;i<numarray.length;i++)
		{
			System.out.println(numarray[i]);
		}		
	}

	private static char[] getdigits(int number) {
		String snum=""+number;
		return snum.toCharArray();
	}

	
	
	private static boolean isPrime(int n) {
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)return false;
		}
		
		return true;
}
}