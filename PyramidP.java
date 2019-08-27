package javacamp;

public class PyramidP {
	static int num=1;
	public static void main(String[] args) {
		for(int row=1;row<24;row++)
		{
			//for(int col=24-row;col<24;col++)
			for(int col=row;col<24;col++)
				{
					
					System.out.print(" ");
					
				}
			
				for(int col=1; col<=row;col++){
				
				System.out.printf("%2d",num++);
				}
				System.out.println("");
		}
	}

}
