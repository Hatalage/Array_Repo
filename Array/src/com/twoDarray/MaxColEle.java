package com.twoDarray;
//WAP to print maximum in columns. 
//Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} output is: 34, 42, and 16. 
public class MaxColEle {
	public static void maxEleOfCol(int a[][])
	{    
		
		int rows=a.length;
		int cols=a.length;
		for(int i=0;i<cols;i++)
		{
		   int  max=a[i][0];
			for(int j=1; j<rows;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println(max+" ");
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{22,31,9},{12,5,16},{34,42,2}};
		maxEleOfCol(arr);
	}
}
