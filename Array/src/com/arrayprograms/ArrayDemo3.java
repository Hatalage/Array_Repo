package com.arrayprograms;

import java.util.Scanner;

public class ArrayDemo3 {
public static void main(String[] args) {
	double marks[] = new double[10];
	int len = marks.length;
	Scanner sc = new Scanner(System.in);
	System.out.println("how many marks you want to add in array:");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter marks: ");
		marks[i]=sc.nextDouble();
	}
	System.out.println("---------Array-------");
	for(int i=0;i<n;i++)
	{
		System.out.println("marks["+i+"]:"+marks[i]);
	}
}
}
