package com.arrayassignment;
//16.	WAP to count frequency of each element in an array.
public class Example16 {
	public static void findFrequency(int a[])
	{
		int len=a.length;
		int count;
		for(int i=0;i<len;i++)
		{
			count=1;
			if(a[i]==-1)
			{
				continue;
			}
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			System.out.println(a[i]+" = "+count);
		}
	}
	public static void main(String[] args) {
		int num[]= {34,45,76,78,34,12,45,23,12,76,34,100,12,12};
		findFrequency(num);
	}
}
