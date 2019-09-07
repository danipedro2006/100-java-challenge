package Algorithms;

public class CheckN {

	public static void main(String[] args) {
		
		CheckN ch=new CheckN();
		System.out.println(ch.checkN(125789,3));
	}

	private  boolean checkN(int n,int k) 
		{
			if(n<=9) return n==k;
						
			else if(n%10==k) return true;
			else return checkN(n/10, k);
					
		}
}