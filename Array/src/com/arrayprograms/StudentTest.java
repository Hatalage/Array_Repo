package com.arrayprograms;

public class StudentTest {
	
	public static void showname(StudentDemo s[])
	{
		int len=s.length;
		for(int i=0;i<len;i++)
		{
			if(s[i].getMarks()>=80)
			{
				System.out.println(s[i]);
			}
		}
	}
public static void main(String[] args) {
	StudentDemo stuarr[]=new StudentDemo[5];
	System.out.println(stuarr[0]); //null
	System.out.println(stuarr[1]); //null
	
	 stuarr[0]=new StudentDemo(11,"rahul",57);
	 stuarr[1]=new StudentDemo(12,"shiv",56);
	 stuarr[2]=new StudentDemo(13,"shivu",55);
	 stuarr[3]=new StudentDemo(14,"shivkumar",54);
	 stuarr[4]=new StudentDemo(15,"shivshrey",53);
	 
	 System.out.println("-------student's details by using for loop------");
	 for(int i=0;i<stuarr.length;i++)
	 {
		 System.out.println(stuarr[i]);
	 }
	 System.out.println("------student's details by using for-each loop-------");
	 for(StudentDemo s:stuarr)
	 {
		 System.out.println(s);
	 }
	 
	 System.out.println("\n");
	 showname(stuarr);
	}
}
