package com.arrayassignment;
//20.	. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 
public class Example20 {
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
			else if(arr[i]<secondMin&&min<arr[i])
			{
				secondMin=arr[i];
			}
		}
		System.out.println("Min : "+min);
		System.out.println("Second min: "+secondMin);
	}
	public static void main(String[] args) {
		int num[]= {-20,0,-25,15,19,37,23};
		System.out.println("----Second Smallest Num----");
		findSecondMin(num);
		
	}
}
