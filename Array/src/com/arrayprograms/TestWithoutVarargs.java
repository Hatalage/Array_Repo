package com.arrayprograms;

public class TestWithoutVarargs {
public int sum(int a,int b)
{
	return a+b;
}
public int sum(int a,int b,int c)
{
	return a+b+c;
}
public int sum(int a,int b,int c,int d)
{
	return a+b+c+d;
}
public static void main(String args[])
{
	TestWithoutVarargs t1=new TestWithoutVarargs();
	System.out.println(t1.sum(10,20));
	System.out.println(t1.sum(10,20,30));
	System.out.println(t1.sum(10,20,30,40));
}
}
