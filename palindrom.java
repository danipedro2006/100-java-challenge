package javacamp;

public class Palindrom {
	static String rtext = "";
	static String text = "abcdefedcba";

	public static void main(String[] args) {

		System.out.println(isPalindrom(text));
	}

	private static boolean isPalindrom(String text) {
		String rtext = reverse(text);
		if (text.equals(rtext))
			return true;
		return false;

	}

	private static String reverse(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			rtext += text.charAt(i);
		}
		return rtext;

	}
}
