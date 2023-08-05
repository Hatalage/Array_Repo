package com.arrayassignment;
//5.	WAP to print all negative elements in an array and also 
//count total number of negative elements in an array.
import java.util.Scanner;

public class Example5 {
	public static void findNegativeElements(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
				
			}
		}
	}
	public static int countNegativeElements(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				count++;
			}
		}
		System.out.println("Total number of negative elements are:"+count);
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		int n=sc.nextInt();
		int num[]=new int[n];
	
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Element:");
			num[i]=sc.nextInt();
		}
		
		findNegativeElements(num);
		countNegativeElements(num);
	}
}

