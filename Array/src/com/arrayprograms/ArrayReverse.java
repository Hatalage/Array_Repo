package com.arrayprograms;
//WAP to print array in reverse
public class ArrayReverse {
 public static void main(String[] args) {
	int arr[] = {34,56,33,67,88};
	int len=arr.length;
	System.out.println("-------Array in Reverse order------");
	for(int i=len-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
}
