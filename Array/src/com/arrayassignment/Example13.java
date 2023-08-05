package com.arrayassignment;
//13.	WAP to find and count total number of duplicate elements in an array
public class Example13 {
	public static void findDuplicate(int a[])
	{
		int len=a.length;
		int count=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			//System.out.println("The duplicate element is: "+a[i]);
		}
		System.out.println("Total count of duplicate elments: "+count);
	}
	public static void main(String[] args) {
		int num[]= {34,45,34,45,12,12,3,3};
		findDuplicate(num);
	}
}


