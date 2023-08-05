package com.arrayprograms;

import java.util.Scanner;

public class SearchElement {
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
	 int num[]= {23,45,63,52,6,7,88};
	 int search;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number which you want to search:");
	 search=sc.nextInt();
	 searchElementInArray(num, search);
 }
}
