package com.twoDarray;

public class TestTwoDArray {
public static void main(String[] args) {
	int mat[][];
	mat=new int[3][3];
	
	//or
	
	int arr[][]=new int[2][2];
	
	//or
	
	int row=4;
	int col=3;
	int arr1[][]=new int[row][col];
	//accesing 2d array
	System.out.println("----------Elements in 2d Array before insertion-------");
	System.out.println(arr1[0][0]);
	System.out.println(arr1[0][1]);
	System.out.println(arr1[1][0]);
	System.out.println(arr1[1][1]);
	
	//after inserting elements in array
	arr1[0][0]=52;
	arr1[0][1]=53;
	arr1[1][0]=54;
	arr1[1][1]=55;
	
	System.out.println("----------Elements in 2d Array after insertion-------");
	System.out.println(arr1[0][0]);
	System.out.println(arr1[0][1]);
	System.out.println(arr1[1][0]);
	System.out.println(arr1[1][1]);
	
	System.out.println("-------Elements in 2D array using for loops-----");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(arr1[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println("---------Elemnts in 2D array using for loops------");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println("Element at arr1["+i+"]["+j+"]="+arr1[i][j]);
		}
	}
}
}
