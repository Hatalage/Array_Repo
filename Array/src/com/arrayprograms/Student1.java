package com.arrayprograms;

import java.util.Arrays;

public class Student1 {

		private int rollno;
		private String name;
		private double marks[];
		Student1(){
			
		}
		Student1(int rollno,String name,double marks[]){
			//marks=new double[3];
			this.rollno=rollno;
			this.name=name;
			this.marks=marks;
		}
		
		public void display() {
			System.out.println("Rollno:"+rollno);
			System.out.println("Name:"+name);
			System.out.println("Marks:"+Arrays.toString(marks));
//			/*System.out.println("Marks achieved in MCQ ,XOBIN and WRITTEN Test");
//			for(int i=0;i<marks.length;i++) {
//				System.out.println(marks[i]);
//			}*/
	}
		
		public String toString() {
			return "Rollno:"+rollno+" Name:"+ name+" Marks:"+Arrays.toString(marks);
		}
	}

