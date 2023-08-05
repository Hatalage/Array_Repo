package com.twoDarray;
//WAP to print maximum in rows. 
//Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25. 
public class MaxRowEle {
public static void maxEleOfRow(int a[][])
{    
	
	int rows=a.length;
	int cols=a.length;
	for(int i=0;i<rows;i++)
	{
	   int  max=a[i][0];
		for(int j=1; j<cols;j++)
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
	int arr[][]= {{22,31,9},{12,25,16}};
	maxEleOfRow(arr);
}
}
