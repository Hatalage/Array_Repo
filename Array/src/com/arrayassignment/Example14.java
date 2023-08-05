package com.arrayassignment;
//14.	WAP to print all unique elements in the array.
public class Example14 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,3,4,5,6,7,6,8,7,8,9,10};
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
