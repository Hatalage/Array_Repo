package com.arrayprograms;

import java.util.Scanner;

public class StudentTestBySetterGetter2 {
static Scanner sc=new Scanner(System.in);
public static void addStudents(StudentDemo s)
{
	System.out.println("Enter Rollno:");
	s.setRollno(sc.nextInt());
	
	System.out.println("Enter Name:");
	s.setName(sc.next());
	
	System.out.println("Enter Marks:");
	s.setMarks(sc.nextDouble());
}
public static void showStudent(StudentDemo sarr[])
{
	for(StudentDemo s:sarr)
	{
		System.out.println(s);
	}
}
public static void main(String[] args) {
	StudentDemo str[]=new StudentDemo[3];
	int len=str.length;
	
	for(int i=0;i<len;i++)
	{
		str[i]=new StudentDemo();
		addStudents(str[i]);
	}
	showStudent(str);
}
}
