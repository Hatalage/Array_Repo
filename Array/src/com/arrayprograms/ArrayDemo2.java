package com.arrayprograms;

public class ArrayDemo2 {
		public static void main(String args[])
		{
			char ch[]= {'a','b','c','d','e','f'};
			int len = ch.length;
			System.out.println("Length of ch: "+len);
			System.out.println("first element of ch: "+ch[0]);
			System.out.println("last element of ch: "+ch[len-1]);
			System.out.println("last element of ch: "+(len-1));
			for(int i=0;i<len;i++)
			{
				System.out.println("element of ch at "+i+":"+ch[i]);
			}
}
}
