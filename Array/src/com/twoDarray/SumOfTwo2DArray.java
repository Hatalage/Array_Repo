package com.twoDarray;

import java.util.Scanner;

public class SumOfTwo2DArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows for tab1: ");
		int rows1=sc.nextInt();
		System.out.println("Enter the no of cols for tab2: ");
		int cols1=sc.nextInt();
		
		System.out.println("Enter the no of rows for tab2: ");
		int rows2=sc.nextInt();
		System.out.println("Enter the no of cols for tab2: ");
		int cols2=sc.nextInt();
		System.out.println("Enter elements in 2D array\n");
		int tab1[][]=new int[rows1][cols1];
		int tab2[][]=new int[rows2][cols2];
		int sum[][]=new int[rows1][cols1];
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				System.out.println("Enter element for tab1["+i+"]["+j+"]");
				tab1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				System.out.println("Enter element for tab2["+i+"]["+j+"]");
				tab2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				sum[i][j]=tab1[i][j]+tab2[i][j];
			}
		}
		
		System.out.println("-------sum of Two matrices------");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
}
}
