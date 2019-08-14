package javacamp;

public class fibonacci {

	public static void main(String[] args) {
		int n=2;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		if(n<=1)
			return 1;
	
		return fib(n-2)+fib(n-1);
	}

}
