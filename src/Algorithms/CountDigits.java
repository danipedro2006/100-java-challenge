//implement a recursive function to count digits an integer digits

package Algorithms;

public class CountDigits {

	public static void main(String[] args) {
		int n = 11211;
		int counter = 0;
		while (n / 10 > 0) {
			n /= 10;
			counter++;
		}
		System.out.println("Given number has: "+(counter + 1)+" digits");
	}

}
