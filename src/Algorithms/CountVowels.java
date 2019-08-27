package Algorithms;

public class CountVowels {
	static int counter=0;
	public static void main(String[] args) {
		String text="jhsfadvccwsjahsiuhdeydu";
		char[] vowels= {'a','e','i','o','u'};
		System.out.println(countvowels(text));
	}

	private static int countvowels(String text) {
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)=='a' || text.charAt(i)=='e'|| 
					text.charAt(i)=='i'|| text.charAt(i)=='o' ||text.charAt(i)=='u' )
			{
				counter++;
			}
		}
		
		return counter;
		
	}

}
