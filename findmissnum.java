package javacamp;

public class findmissnum {

	public static void main(String[] args) {
		int[] series= {1,2,3,4,5,6,7,8,0,10};
		int sum =series.length*(series.length+1)/2;
		int rsum=sum;
		int sumc=0;
		for(int i=0;i<series.length;i++)
		{
			sumc+=series[i];
		}
		int res=rsum-sumc;
		System.out.println(sum);
		System.out.println(sumc);
		System.out.println(res);
	}

}
