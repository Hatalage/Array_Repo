package com.arrayassignment;
//Write a Java program to find the common elements between two arrays (int values) 
//Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 66, 22],
//so common between two arrays are 23 and 91
public class Example25 {
	public static void findCommonElementsfromTwoArr(int a[],int b[])
	{
		int len1=a.length;
		int len2=b.length;
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr1[]= {12,23,34,67,78,91,56};
		int arr2[]= {39,25,15,23,55,91,66,22};
		findCommonElementsfromTwoArr(arr1,arr2);
	}
}
