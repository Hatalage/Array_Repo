package com.arrayprograms;

public class BubbleSortDemo {
	public static int[] sortElements(int arr[])
	{
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int num[]= {23,45,6,67,78,10};
		int sortOrder[]=sortElements(num);
		System.out.println("----Sorted Array---");
		for(int s:sortOrder)
		{
			System.out.println(s);
		}
	}
}
