package com.arrayassignment;
//WAP to swap array like input array is [2, 4, 9, 0],
//so your output array must be [9, 0, 2, 4] 
public class Example26of2 {
public static void swapTwoArr(int a[])
{
	int len1=a.length;
	int b[]=new int[len1];
	int index=0;
	for(int i=0;i<len1;i++)
	{
		if(a[i]==a[index])
		{
			b[i]=a[len1-2];
		}
		else if(a[i]==index++)
		{
			b[i]=a[len1-1];
		}
		else if(a[i]==a[len1-2])
		{
			b[i]=a[len1-4];
		}
		else if(a[i]==a[len1-1])
		{
			b[i]=a[len1-3];
		}
		System.out.println(b[i]);
	}
}
public static void main(String[] args) {
	int num[]= {2,4,9,0};
	swapTwoArr(num);
}
}
