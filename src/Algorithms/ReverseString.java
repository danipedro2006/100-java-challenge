package Algorithms;

public class ReverseString {
	static String rtext="";
	public static void main(String[] args) {
		String text="abcdefghijklmn";
		System.out.println(reverse(text));
	}

	private static String reverse(String text) {
		for(int i=text.length()-1;i>=0;i--)
		{
			rtext+=text.charAt(i);
		}
		return rtext;
		
	}

}
