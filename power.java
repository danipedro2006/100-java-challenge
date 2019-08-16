package javacamp;

public class power {

	public static void main(String[] args) {
		int base=2;
		int exponent=10;
		pow(base, exponent);
		pow1(base, exponent);
	}

	private static void pow(int b, int e) {
		while(e >1)
		{
			b+=b;
			--e;
		}
		System.out.println(b);
	}

	private static void pow1(int b, int e) {
		for(;e >1;--e)
		{
			b+=b;
			
		}
		System.out.println(b);
	}
}
