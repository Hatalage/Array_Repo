package com.arrayassignment;
//7.Write two methods that return the average of an array with following headers.
//a.	public static int average(int[] array)
//b.	public static double average(double[] array).
//c.	Write main and invoke the 2 methods. 

import java.util.Scanner;

public class Example7 {
	public static int average(int arr[])
	{
		int sum=0;
		int avg;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=(sum/arr.length);
		return avg;
	}
	public static double average(double arr[])
	{
		double sum=0;
		double avg;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=(sum/arr.length);
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements for int method:");
		int n1=sc.nextInt();
		int num1[]=new int[n1];
		for(int i=0;i<n1;i++) {
			System.out.println("Enter element:");
			num1[i]=sc.nextInt();
		}
		System.out.println("Enter no of elements for double method:");
		int n2=sc.nextInt();
		double num2[]=new double[n2];
		for(int i=0;i<n2;i++) {
			System.out.println("Enter element:");
			num2[i]=sc.nextDouble();
		}
		int ans1=average(num1);
		System.out.println("int method avg:"+ans1);
		double ans2=average(num2);
		System.out.println("double method avg:"+ans2);
	}
	}

