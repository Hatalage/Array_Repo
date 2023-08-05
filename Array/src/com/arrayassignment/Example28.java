package com.arrayassignment;
//28.WAP to calculate average of all elements in an Array except max and min element 
//(Means don’t include the highest and lowest number of your array in your average).
public class Example28 {
	public static int findMaxNum(int a[])
	{
		int max=a[0];
		int len=a.length;
		for(int i=1;i<len;i++)
		{
			if(a[i]>max)
			{
				continue;
			}
		}
		return max;
	}
public static int findMinNum(int a[])
{
	int min=a[0];
	int len=a.length;
	for(int i=1;i<len;i++)
	{
		if(a[i]<min)
		{
			continue;
		}
	}
	return min;
}
public static int findAvg(int a[])
{
	int sum=0;
	int avg=0;
	for(int i=0;i<a.length;i++)
	{
		findMaxNum(a);
		findMinNum(a);
		sum=sum+a[i];
		avg=(sum)/a.length;
	}
	return avg;
}

public static void main(String[] args) {
	int num[]= {1,2,3,4,5,6,7,8};
	System.out.println("Average is: "+findAvg(num));
}
}
