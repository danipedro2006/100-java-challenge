package Algorithms;

public class DecBin {

	public static void main(String[] args) {
		bin(4);
	}

	private static void bin(int n) {
		String bs="";
		if(n/2==0)
		{
			System.out.print(n%2);
		}
		else
		{
			
			bin(n/2);
			System.out.print(n%2);
		}
	}

}
