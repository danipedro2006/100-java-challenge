package Algorithms;

public class SwapShift {

	public static void main(String[] args) {
		int a = 2, b = 3, c = 4;
		a = b ^ 2;
		b = a ^ 1;
		a = a ^ 2;

		System.out.println(a);
		System.out.println(b);
	}

}
