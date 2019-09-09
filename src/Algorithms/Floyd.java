
package Algorithms;

public class Floyd {
	
	static int num = 1;

	public static void main(String[] args) {
		
		for (int i = 1; i < 25; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.printf("%5d", num);
				num++;
			}

			System.out.println(" ");

		}
	}
}
