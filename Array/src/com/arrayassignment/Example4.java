package com.arrayassignment;
//4.	WAP to take array and print all positive numbers 
import java.util.Scanner;

public class Example4 {
		public static void findPositiveEle(int a[])
		{
			int len=a.length;
			for(int i=0;i<len;i++)
			{
				if(a[i]>0)
				{
					System.out.println(a[i]);
				}
			}
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the elments");
			int n=sc.nextInt();
			int num[]=new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("enter element:");
				num[i]=sc.nextInt();
			}
			findPositiveEle(num);
		}
}
