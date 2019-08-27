package Algorithms;

public class MaxMin{

	public static void main(String[] args) {
		int[] series= {12,4,5,3,8,9,12,78};
		System.out.println(max(series));
		System.out.println(min(series));
	}

	private static int max(int[] series) {
		int max=series[0];
		for(int i=0;i<series.length;i++)
		{
			if(series[i]>max)
			{
				max=series[i];
				
			}
		}
		return max;
	}
	private static int min(int[] series) {
		int min=series[0];
		for(int i=0;i<series.length;i++)
		{
			if(series[i]<min)
			{
				min=series[i];
				
			}
		}
		return min;
	}
}
