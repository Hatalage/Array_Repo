package com.arrayassignment;
//Write a Java program to find the duplicate values of an array of integer values. Means 
//e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78. 
public class Example24 {
	public static void findDuplicateElements(int a[])
	{
		int len1=a.length;
		for(int i=0;i<len1-1;i++)
		{
			for(int j=i+1;j<len1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
	  }
	}
	public static void main(String[] args) {
		int arr1[]= {3,10,90,78,56,10,78,34,61};
		findDuplicateElements(arr1);
	}
}
