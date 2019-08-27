package javacamp;

public class LCM {

	public static void main(String[] args) {
		int a = 15;
		int b = 25;
		lcm(a, b);
	}

	private static void lcm(int a, int b) {

		for (int i = Math.min(a, b); i < a * b; i++) {
			if ((i % a == 0) && (i % b == 0)) {
				System.out.println(i);
				break;
			}
		}

	}

}
