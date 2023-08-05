package com.twoDarray;

import java.util.Scanner;

public class Demo2DArray {
public static void main(String[] args) {
	int tab[][]=new int[3][3];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows: ");
	int rows=sc.nextInt();
	System.out.println("Enter the no of cols: ");
	int cols=sc.nextInt();
	
	System.out.println("Enter elements in 2D array\n");
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.println("Enter element for tab["+i+"]["+j+"]");
			tab[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("-------2D Array------");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print(tab[i][j]+"\t");
		}
		System.out.println();
	}
}
}
