package com.labprograms;

public class ArrayRotate1 {
	public static int[] arrayShift(int a[])
	{
		int lastIndex=a.length-1;
		int lastIndexvalue=a[a.length-1];
		 for(int i=a.length-2;i>=0;i--)
		 {
			 a[lastIndex]=a[i];
			 lastIndex--;
			 if(i==0)
			 {
				 a[i]=lastIndexvalue;
			 }
		 }
		 return a;
		 
	}
public static void main(String[] args) {
	int arr[]= {4,5,6,7};
	int ans[]=arrayShift(arr);
	System.out.println("------Array after rotation------ ");
	System.out.print("[");
	for(int s:ans)
	{
		System.out.print(s+" ");
	}
	System.out.print("]");
}
}
