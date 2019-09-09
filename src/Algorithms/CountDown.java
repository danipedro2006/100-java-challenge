//implement a recursive count-down function

package Algorithms;

public class CountDown {

	public static void main(String[] args) {
		countDown(10);
	}

	private static void countDown(int n) {
		if (n == 1) {
			System.out.println(1);
		} else {
			System.out.println(n);
			countDown(n - 1);

		}
	}

}
