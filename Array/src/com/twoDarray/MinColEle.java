package com.twoDarray;
//WAP to print minimum in columns. 
//Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} output is: 12, 5, 2.
public class MinColEle {
	public static void minEleOfCol(int a[][])
	{    
		
		int rows=a.length;
		int cols=a.length;
		for(int i=0;i<cols;i++)
		{
		   int  min=a[i][0];
			for(int j=1; j<rows;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			System.out.println(min+" ");
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{22,31,9},{12,5,16},{34,42,2}};
		minEleOfCol(arr);
	}
}
