package com.arrayassignment;
//6.	WAP to take array and print prime numbers
import java.util.Scanner;

public class Example6 {
		public static void printPrimeNums(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				int count=0;
				for(int j=2;j<a[i];j++)
				{
				if(a[i]%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]+" prime");
			}
			else
			{
				System.out.println(a[i]+" not a prime");
			}
			}
					
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the elements");
			int n=sc.nextInt();
			int num[]=new int[n];
		
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Element:");
				num[i]=sc.nextInt();
			}
			printPrimeNums(num);
		}
}
