package javacamp;

public class countdigits {

	public static void main(String[] args) {
		int n=1;
		int counter=0;
		while(n/10>0)
		{
			n/=10;
			counter++;
		}
		System.out.println(counter+1);
	}

}
