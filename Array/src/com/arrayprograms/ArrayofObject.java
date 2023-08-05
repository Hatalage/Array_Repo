package com.arrayprograms;

public class ArrayofObject {
public static void main(String[] args) {
	Student1 s1=new Student1(101,"shiv",new double[] {45,30,85});
	
	double m1[]= {45,56,78};
	double m2[]= {34,56,23};
	double m3[]= {23,57,89};
	double m4[]= {78,99,88};
	
	Student1 s2= new Student1(102, "shrey",m1);
	Student1 s3= new Student1(103, "shreyash",m2);
	Student1 s4= new Student1(104, "shreya",m3);
	Student1 s5= new Student1(105, "shreyu",m4);
	
	
	
	System.out.println("-------student1------");
	s1.display();
	
	
	System.out.println("-------student2------");
	s2.display();
	
	System.out.println("-------student3------");
	s3.display();
	
	System.out.println("-------student4------");
	s4.display();
	
	System.out.println("-------student5------");
	s5.display();
	
}
}
