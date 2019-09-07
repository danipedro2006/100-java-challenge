package Algorithms;

public class CountDown {

	public static void main(String[] args) {
		countD(10);
	}

	private static void countD(int n) {
		if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			countD(n-1);
			
		}
	}

}
