package com.arrayprograms;

public class MinMaxNum {
	public static int findMaxNum(int a[])
	{
		int max=a[0];
		int len=a.length;
		for(int i=1;i<len;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
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
			min=a[i];
		}
	}
	return min;
}
public static void main(String args[])
{
	int num[] = new int[]{13,30,45,77,99,23,45,10};
	System.out.println("Maximum number is: "+findMaxNum(num));
	System.out.println("Maximum number is: "+findMinNum(num));
}	
}

