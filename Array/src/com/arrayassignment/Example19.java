package com.arrayassignment;
//19.	WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
public class Example19 {
	public static void findSecondMax(int arr[])
	{
		int max=arr[0],secondMax=arr[1],len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i]>max)
			{
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax&&max>arr[i])
			{
				secondMax=arr[i];
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Second max: "+secondMax);
	}
	public static void main(String[] args) {
		int num[]= {20,0,31,45,100,1,105,90};
		System.out.println("----Second Largest Num----");
		findSecondMax(num);
		
	}
}
