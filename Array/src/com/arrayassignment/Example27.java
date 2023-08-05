package com.arrayassignment;
//27.	Write a Java program to find a missing number in an array.
//Means e.g. array has 1 to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5 
public class Example27 {
		static int max,min;
		public static void findMaxNum(int a[])
		{
			max=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
		}
		public static void findMinNum(int a[])
		{
				min=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
			}
		}
		public static void findMissingNum(int a[])
		{
			findMaxNum(a);
			findMinNum(a);
			for(int i=min;i<=max;i++)
			{
				int count=0;
				for(int j=0;j<a.length;j++)
				{
					if(i==a[j])
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.println(i);
				}
			}
		
		}
		public static void main(String args[])
		{
			int a[]=new int[]{1,2,4,6,7,8,9};
			findMissingNum(a);
		}
}
