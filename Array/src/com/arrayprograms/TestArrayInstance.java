package com.arrayprograms;

import java.util.Arrays;

class Student
{
	int rollno;
	String name;
	int marks[];
	 Student(int rollno,String name,int marks[])
	 {
		 this.rollno=rollno;
		 this.name=name;
		 this.marks=marks;
	 }
	 public String toString()
	 {
		 return "RollNo:"+rollno+"\nName:"+name+"\nMarks:"+Arrays.toString(marks);
	 }
}
public class TestArrayInstance {
	public static void main(String[] args) {
		int sum1 = 0,sum2=0,sum3=0;
		int m1[]= {90,94,90,95};
		int m2[]= {55,67,89,98};
		int m3[]= {46,78,99,34};
		for(int i=0;i<m1.length;i++)
		{
			sum1=sum1+m1[i];
		}
		for(int i=0;i<m2.length;i++)
		{
			sum2=sum2+m2[i];
		}
		for(int i=0;i<m3.length;i++)
		{
			sum3=sum3+m3[i];
		}
		Student s = new Student(101,"Shivani",m1);	
		Student s1 = new Student(102,"Shreyash",m2);
		Student s2 = new Student(103,"Shiv",m3);	
		System.out.println(s);
		System.out.println("sum of shivani's marks: "+sum1);
		System.out.println("---------------------");
		System.out.println(s1);
		System.out.println("sum of shreyash's marks: "+sum2);
		System.out.println("---------------------");
		System.out.println(s2);
		System.out.println("sum of shiv's marks: "+sum3);
		}
}
