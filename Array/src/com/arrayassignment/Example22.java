package com.arrayassignment;
//22.WAP to reverse the array itself, don’t print array in reverse –
//I want current array reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78]
//so your same array must be [78, 37, 29, 45, 90, 3] by using temporary array. 
public class Example22 {
    public static void reverseArr(int a[])
    { 
    	int len=a.length;
    	int temp[]=new int[len];
    	System.out.print("[");
    	for(int i=0;i<a.length;i++)
    	{
    		temp[i]=a[a.length-i-1];
    		System.out.print(" ");
    		System.out.print(temp[i]);
    	}
    	System.out.print("]");
    }
    	public static void main(String[] args) {
		int num[]= {78,37,29,45,90,3};
		System.out.println("------Array reverse with temporary Array------");
		reverseArr(num);
	}
}
