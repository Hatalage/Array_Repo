package com.labprograms;

public class ArrayRotate2 {
public static int[] arrayShift2(int a[])
{
	int lastIndex=a.length-1;
	int lastIndexValue=a[a.length-1];
	System.out.println("------Array After to rotation------");
	System.out.print("[ ");
	for(int i=lastIndex;i>=0;i--)
	{
		a[lastIndex]=a[i];
		lastIndex--;
		System.out.print(a[i]+" ");
	}
	System.out.println("]");
	
	return a;
}
public static void main(String[] args) {
	int arr[]= {3,1,7,8};
	int ans[]=arrayShift2(arr);
}
}
