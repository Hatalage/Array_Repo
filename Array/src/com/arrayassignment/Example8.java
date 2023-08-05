package com.arrayassignment;
//8.	WAP to search for a given number in an array and accordingly print the index if exists.
import java.util.Scanner;

public class Example8 {
	 public static void searchElementInArray(int a[],int searchElement)
	 {
		 int len=a.length;
		 int position=-1;
		 for(int i=0;i<len;i++)
		 {
			 if(searchElement==a[i])
			 {
				 position=i;
				 break;
			 }
		 }
		 if(position!=-1)
		 {
			 System.out.println(searchElement+" is present at index: "+position);
		 }
		 else
		 {
			 System.out.println(searchElement+" is not present in given array");
		 }
	 }
	 public static void main(String args[])
	 {
		 int search;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter no of elements for array:");
			int n=sc.nextInt();
			int num[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter element:");
				num[i]=sc.nextInt();
			}
		 System.out.println("Enter number which you want to search:");
		 search=sc.nextInt();
		 searchElementInArray(num, search);
	 }
	}


