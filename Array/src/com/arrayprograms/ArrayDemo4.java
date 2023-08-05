package com.arrayprograms;

import java.util.Scanner;

public class ArrayDemo4 {
 public static void main(String[] args) {
	String name[] = new String[10];
	int len = name.length;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many names you want to enter");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter names: ");
		name[i]=sc.next();
	}
	System.out.println("---------Array-------");
	for(int i=0;i<n;i++)
	{
		System.out.println("names["+i+"]:"+name[i]);
	}
}
}
