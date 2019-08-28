package Algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = { 5, 36, 11, 25, 6, 2, 18, 9, 10 };
		print(numbers);
		BSort(numbers);
		System.out.println("Sorted list");
		print(numbers);
	}

	private static void print(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	private static void BSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					swap(numbers, i, j);
				}
			}
		}
	}

	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

}
