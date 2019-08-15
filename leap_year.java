package javacamp;

public class leap_year {

	public static void main(String[] args) {
		int yy=2002;
		
		System.out.println(isLeap(yy));
		
	}

	private static boolean isLeap(int yy) {
		if(yy%4==0 && yy%100!=0) return true;
		else
		return false;
		
	}

}
