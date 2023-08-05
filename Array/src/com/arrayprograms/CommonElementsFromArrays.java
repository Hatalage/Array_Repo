package com.arrayprograms;

public class CommonElementsFromArrays {
public static void findCommonElements(int a[],int b[])
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
	int arr1[]= {10,20,30,40,50};
	int arr2[]= {30,40,50,60,90};
	findCommonElements(arr1,arr2);
}
}
