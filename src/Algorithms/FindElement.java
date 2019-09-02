package Algorithms;

// find array elements which sum to a given integer

public class FindElement {

	public static void main(String[] args) {
		int[] serial = { 2, 4, 5, 3, 7, 6, 2, 4 };
		int sum = 7;
		findElemtoSum(serial, sum);
	}

	private static void findElemtoSum(int[] ser, int sum) {
		for (int i = 0; i < ser.length; i++) {
			for (int j = i; j < ser.length; j++) {
				if (ser[i] + ser[j] == sum) {
					System.out.println(ser[i] + "+" + ser[j] + "=" + (ser[i] + ser[j]));
				}
			}
		}

	}

}
