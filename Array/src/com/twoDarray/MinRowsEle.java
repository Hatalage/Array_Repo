package com.twoDarray;
//WAP to print minimum in rows. 
//Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 9 and 12.
public class MinRowsEle {
	public static void minEleOfRow(int a[][])
	{    
		
		int rows=a.length;
		int cols=a.length;
		for(int i=0;i<rows;i++)
		{
		   int  min=a[i][0];
			for(int j=1; j<cols+1;j++)
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
		int arr[][]= {{22,31,9},{12,25,16}};
		minEleOfRow(arr);
	}
}
