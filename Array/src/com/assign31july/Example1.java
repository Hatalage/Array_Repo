package com.assign31july;

public class Example1 {
	public static int[] mergeTwoArrays(int a[],int b[]) {
		int i,j=0;
		int len1=a.length;
		int len2=b.length;
		int len3=len1+len2;
		int newArr[]=new int[len3];
		
		for(i=0;i<len3;i++) {
			
			if(i<len1) {
			  newArr[i]=a[i];
			}
			else {
				newArr[i]=b[j];
				j++;
				
			}
		}
		return newArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {1,3,4,5};
		int arr2[]= {2,4,6,8};
		
		System.out.println("---Merge Array-----");
		int mergeArr[]=mergeTwoArrays(arr1, arr2);
		
		for(int a:mergeArr) {
			System.out.print(a+" ");
		}
	}

}
