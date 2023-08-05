package com.arrayprograms;

public class ReplaceZero {
	public static void replaceWithZero(int arr[])
	{
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
		}
	}
	public static void main(String args[])
	{
		int num[]=new int[] {78,2,55,0,8,42,79,0,0,69,56};
		replaceWithZero(num);
	}
}
