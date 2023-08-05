package com.arrayprograms;

import java.util.Scanner;

public class FindSumOfArray {
	public static int findSumOfArray(int a[]) {
		int sum=0;
		int length=a.length;
		for(int i=0;i<length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n=sc.nextInt();
		int num[]=new int[n];
		//step 1-insert elements in array
		for(int i=0;i<n;i++) {
			System.out.println("Enter element:");
			num[i]=sc.nextInt();
		}
		int ans=findSumOfArray(num);
		System.out.println("sum:"+ans);
	}

}

