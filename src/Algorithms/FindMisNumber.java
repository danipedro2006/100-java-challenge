//java code to find the missing number from a given series

package Algorithms;

public class FindMisNumber {

	public static void main(String[] args) {
		
		int[] series = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 10 };
		int sum = series.length * (series.length + 1) / 2;
		
		
		//keep track of initial sum
		int rsum = sum;
		
		// recalculate sum without one term 
		int sumc = 0;
		
		for (int i = 0; i < series.length; i++) {
			sumc += series[i];
		}
		
		//find the missing number by subtraction
		int  missingNum = rsum - sumc;

			System.out.println("The missing number is:  "+ missingNum);
	}

}
