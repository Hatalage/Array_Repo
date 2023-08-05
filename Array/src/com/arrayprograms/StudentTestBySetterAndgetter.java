package com.arrayprograms;

import java.util.Scanner;

public class StudentTestBySetterAndgetter {
public static void main(String[] args) {
	StudentDemo str[]=new StudentDemo[3];
	int len=str.length;
	System.out.println("Enter Data for student array");
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<len;i++)
	{
		str[i]=new StudentDemo();
		System.out.println("Enter Rollno");
		str[i].setRollno(sc.nextInt());
		 
		System.out.println("Enter name:");
		str[i].setName(sc.next());
		
		System.out.println("Enter Marks: ");
		str[i].setMarks(sc.nextDouble());
	}
	
	System.out.println("------Display-----");
	for(StudentDemo s:str)
	{
		System.out.println(s);
	}
}
}
