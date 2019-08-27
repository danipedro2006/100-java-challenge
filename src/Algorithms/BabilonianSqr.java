package Algorithms;
import java.lang.*;
public class BabilonianSqr {
	static double r,dif,res;
	
	public static void main(String[] args) {
		double n=2.0;
		System.out.println(sqr(6.0));
	}

	private static double sqr(double n) {
		
		double fguess=n/2, lguess = 0, delta = 0.1;
		
		while(delta>0.00001)
			{
				lguess=(fguess+n/fguess)/2.0;
				delta=Math.abs(fguess-lguess);
				fguess=lguess;
			}
		
		return lguess;
	}

}


