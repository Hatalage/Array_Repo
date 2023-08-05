package com.arrayprograms;

public class TestWithVarargs {
public static void show(int... a)
{
	System.out.println("varargs");
}
public static int sum(int... b)
{
	int sum=0;
	for(int i:b)
	{
		sum=sum+i;
	}
	return sum;
}
public static void main(String[] args) {
	show(10);
	show(10,20);
	show(10,20,30);
	int a[]= {12,34,56,78};
	show(a);
	
	System.out.println("-------sum-----");
	System.out.println(sum(10,20));
	System.out.println(sum(10,20,30));
	System.out.println(sum(10,20,30,40));
}
}
