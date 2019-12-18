package javadrills;

import java.util.Scanner;

public class ArmstrongN {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int n=in.nextInt();
		String nString=""+n;
		
		//System.out.println(nString);
		//System.out.println(nLength);
		System.out.println(isArmstrong(nString));
	}

	public static int isArmstrong(String nString) {
		int sum=0;
		int nLength=nString.length();
		for(char  i:nString.toCharArray()) {
			sum+=Math.pow((int)i-48, nLength);
		}
		return sum;
	}

}
