package javacamp;

public class check_alphabet {

	public static void main(String[] args) {
		String text="hjahfhry57fngyrfwfgxtr";
		String text2="abcdefghijklmnopqrstuvxyzw";
		String textCap=text.toLowerCase();
		char[] textarray=textCap.toCharArray();
		checkAlpha(text);
		//97 to 122
	}

	private static void checkAlpha(String text) {
		
			/*for(char chars=97;chars<=122;chars++)
				{*/
					for(int j=0;j<text.length();j++)
					{
						int charCode=(int) text.charAt(j);
						if(charCode<97 || charCode>122) System.out.println("nu este alfabet");;;
						
					}
					
				}
		}
	


