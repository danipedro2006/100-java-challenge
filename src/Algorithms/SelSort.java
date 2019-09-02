package Algorithms;

public class SelSort {

	public static void main(String[] args) {
		int[] numbers = { 5, 36, 11, 25, 6, 2, 18, 9, 10 };
		print(numbers);
		SelSort(numbers);
		System.out.println("Sorted list");
		print(numbers);
	}

	private static void print(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	private static void SelSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			
			
			}
		}
	
	
	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
