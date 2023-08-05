package com.arrayassignment;
//WAP to replace all the 0’s with 1’s in your array. 
//Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34] 
public class Example29 {
public static void replaceWithOne(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			a[i]=1;
		}
	}
	//System.out.println(a[i]);
}
}
