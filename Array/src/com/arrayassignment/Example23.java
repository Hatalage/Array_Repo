package com.arrayassignment;
//23.	. WAP to reverse the array itself, don’t print array in reverse 
//I want current array reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] 
//so your same array must be [78, 37, 29, 45, 90, 3] without using temporary array. 
public class Example23 {
	public static void arrReverse(int a[])
	{
		System.out.print("[");
		for(int i=a.length-1;i>=0;i--)
		{
			
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		int num[]= {3,90,45,29,37,78};
		System.out.println("-------Array in Reverse order------");
		arrReverse(num);
	}
}
