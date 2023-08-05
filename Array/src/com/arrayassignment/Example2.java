package com.arrayassignment;
//2.WAP to accept dimension of 1D array and create and accept data in that array. 
//Calculate the sum and average value of array elements.
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		int num[]=new int[10];
		int len=num.length;
		int sum=0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n= sc.nextInt();
		//step-1 insert elements in array
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element: ");
			num[i]=sc.nextInt();
		}
		//step-2 find sum
		for(int i=0;i<n;i++)
		{
			sum=sum+num[i];
			avg=sum/num[i];
		}
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		
	}
}

