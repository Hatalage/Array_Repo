package com.arrayassignment;
//9.	WAP to copy an array by iterating the array
import java.util.Arrays;

public class Example9 {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= new int[5];
		for(int i=0; i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<arr2.length;i++)
		{
		System.out.print(arr2[i]+" ");
		}
	}
}
