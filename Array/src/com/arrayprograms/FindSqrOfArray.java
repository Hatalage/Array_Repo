package com.arrayprograms;

public class FindSqrOfArray {
public static int[] findSqr(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=arr[i]*arr[i];
	}
	//System.out.println(arr[i]);
	return arr;
}
public static void main(String[] args) {
	int num[]= {1,2,3,4,5};
	System.out.println(findSqr(num));
}
}
