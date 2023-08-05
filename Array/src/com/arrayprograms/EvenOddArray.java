package com.arrayprograms;

public class EvenOddArray {
  public static void EvenAndOddArray(int a[])
  {
	  int newEven[],newOdd[];
	  int len=a.length;
	  int ieven=0,iodd=0;
	  
	  newEven=new int[a.length];
	  newOdd=new int[a.length];
	  
	  for(int i=0;i<len;i++)
	  {
		  if(a[i]%2==0)
		  {
			  newEven[ieven]=a[i];
			  ieven++;
		  }
		  else
		  {
			  newOdd[iodd]=a[i];
			  iodd++;
		  }
	  }
	  System.out.println("Printing Array of even numbers");
	  for(int i=0;i<ieven;i++)
	  {
		  System.out.println(newEven[i]);
	  }
	  System.out.println("Printing Array of odd numbers");
	  for(int i=0;i<iodd;i++)
	  {
		  System.out.println(newOdd[i]);
	  }

  }
  public static void main(String args[])
  {
	  int num[]=new int[] {1,2,3,4,5,6,7,8,9};
	  EvenAndOddArray(num);
  }
}
