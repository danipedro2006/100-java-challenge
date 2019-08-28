package Algorithms;

public class BinSearch {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arlen = numbers.length - 1;

		int index = binSearch(numbers, 0, arlen, 7);
		if (index == -1) {
			System.out.println("Value not found");
		} else {
			System.out.println("Value found at index: " + index);
		}

	}

	static int binSearch(int[] array, int l, int r, int x) {
		if (l <= r) {

			int mid = l + (r - l) / 2;

			if (array[mid] == x) {
				return mid;
			}

			if (array[mid] > x) {

				return binSearch(array, l, mid - 1, x);
			}

			else {
				return binSearch(array, mid + 1, r, x);
			}

		}

		return -1;

	}
}
