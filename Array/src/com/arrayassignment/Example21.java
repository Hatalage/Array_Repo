package com.arrayassignment;
//21.	. WAP to print the array in reverse order. 
//E.g. arr[] = [3, 90, 45, 29, 37, 78] so your output must be 78, 37, 29, 45, 90, 3 
public class Example21 {
	public static void arrReverse(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		int num[]= {3,90,45,29,37,78};
		System.out.println("-------Array in Reverse order------");
		arrReverse(num);
	}
}
