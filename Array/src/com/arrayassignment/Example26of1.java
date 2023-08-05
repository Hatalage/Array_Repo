package com.arrayassignment;
//Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 32, 42, 52, 62] 
		//and arr2[] = [52, 22, 62, 12, 42, 22] Here both arrays are equal 
public class Example26of1 {
public static void equalArr(int a[],int b[])
{
	int len1=a.length;
	int len2=b.length;
	for(int i=0;i<len1;i++)
	{
		for(int j=0;j<len2;j++)
		{
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" = "+b[j]);
				System.out.println();
				
			}
		}
	}
	System.out.println("Arrays are equal");
}
public static void main(String[] args) {
	int arr1[]= {12,22,32,42,52,62};
	int arr2[]= {52,22,62,12,42,22};
	equalArr(arr1,arr2);
}
}
