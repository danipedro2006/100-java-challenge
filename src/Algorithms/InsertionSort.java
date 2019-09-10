package JavaCollections;

import java.util.Random;

public class InsertionSort
	{
public static void main(String[] args)
	{
		int size=10;
		int[] data=new int[size];
		for(int i=0;i<size;i++)
			{
				data[i]=(int) (Math.random()*100);
			}
		System.out.println("Lista nesortata");
		for(int i=0;i<size;i++)
			{
				System.out.println(data[i]);
			}
		
		for(int i=0;i<size;i++)
			{
			for(int j=i;j<size-1;j++)
				{
				if(data[j]<data[j+1])
					{
						int temp=data[j];
						data[j]=data[j+1];
						data[j+1]=temp;
					}
				}
			}
		System.out.println("Lista sortata");
		for(int i=0;i<size;i++)
			{
				System.out.println(data[i]);
			}
}
}