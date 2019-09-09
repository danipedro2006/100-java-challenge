package recursion;

public class DigitsN 
{
	public static void main(String[] args) 
		{
			DigitsN d=new DigitsN();
			System.out.println(d.digitsN(11));
		}

	private int digitsN(int n) 
	{
		
		if(n/10<1)
			{
				return 1;
			}
		else
			{
				return 1+digitsN(n/10);
			}
	}
}