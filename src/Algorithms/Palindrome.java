package Algorithms;

public class Palindrome
	{

		public static void main(String[] args)
			{
				String firstWord="abracacarba";
				String reversedWord=new StringBuilder(firstWord).reverse().toString();
				boolean isPalindrome=firstWord.equals(secondWord);
				if(isPalindrome==true) 
					System.out.println("Is Palindrome");
				else
					System.out.println("Is not Palindrome");
			}

	}
