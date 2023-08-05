package com.arrayassignment;
//15.	WAP to find the second smallest element in an array.
public class Example15 {
	public static void findSecondMin(int arr[])
	{
		int min=arr[0],secondMin=arr[1],len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i]<min)
			{
				secondMin=min;
				min=arr[i];
			}
			else if(arr[i]<secondMin && min<arr[i])
			{
				secondMin=arr[i];
			}
		}
		System.out.println("Min : "+min);
		System.out.println("Second min: "+secondMin);
	}
	public static void main(String[] args) {
		int num[]= {100,23,45,6,67,78,10};
		System.out.println("----Second Smallest Num----");
		findSecondMin(num);
		
	}
}
