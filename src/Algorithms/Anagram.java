// java program to determine if a given string is anagram


package Algorithms;

public class Anagram {

	public static void main(String[] args) {
		String word = "abcd";
		char[] wordAr = word.toCharArray();
		String anagram = "bcda";
		char[] anagramAr = anagram.toCharArray();

		System.out.println(sum(wordAr));
		System.out.println(sum(anagramAr));
	}

	private static int sum(char[] txt) {
		int sum = 0;
		for (int i = 0; i < txt.length; i++) {
			sum += (int) txt[i];
		}
		return sum;
	}

	private static char[] sort(char[] w) {
		for (int i = 0; i < w.length; i++) {
			{
				if (w[i] > w[i + 1]) {
					char temp = w[i];
					w[i] = w[i = 1];
					w[i + 1] = temp;
				}

			}
		}
		return w;
	}

	private static boolean isAnagram(char[] wordAr, char[] anagramAr) {
		for (int i = 0; i < wordAr.length; i++) {
			for (int j = 0; j < anagramAr.length; j++) {
				if (wordAr[i] != anagramAr[j])
					return false;
			}
		}
		return true;
	}

}
