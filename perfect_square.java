package javacamp;

public class perfect_square {

	public static void main(String[] args) {
		int n=81;
		System.out.println(isPerfectSq(n));
	}

	private static boolean isPerfectSq(int n) {
		if(n%4==0 || n%4==1)
		{
			return true;
		}
		return false;
	}

}
