package com.arrayprograms;

public class ArrayDemo1 {
	public static void main(String args[])
	{
		int num[];
		num=new int[5];
		System.out.println("before assigning values: ");
		System.out.println("Element at index 0: "+num[0]);
		System.out.println("Element at index 0: "+num[1]);
		System.out.println("Element at index 0: "+num[2]);
		System.out.println("Element at index 0: "+num[3]);
		System.out.println("Element at index 0: "+num[4]);
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		System.out.println("..............................");
		System.out.println("after assigning values: ");
		System.out.println("Element at index 0: "+num[0]);
		System.out.println("Element at index 0: "+num[1]);
		System.out.println("Element at index 0: "+num[2]);
		System.out.println("Element at index 0: "+num[3]);
		System.out.println("Element at index 0: "+num[4]);
	}		
}
