package com.assign31july;

public class Example2 {
		public static int[] mergeArrays(int a[],int b[])
		{
			int len1=a.length;
			int len2=a.length;
			int len3=len1+len2;
			int newArr[]=new int[len3];
			int index=0;
			boolean status = false;
			for(int s=0;s<len1;s++)
			{
				newArr[index++]=a[s];
			}
			for(int i=0;i<len2;i++)
			{
				status=false;
				for(int j=0;j<index;j++) {
					if(b[i]==newArr[j]) {
						status=true;
					}
				}
				if(status)
					continue;
				else
				{
					newArr[index++]=b[i];
				}
			}
			return newArr;
		}
		public static void main(String[] args) {
			int arr1[]= {1,3,4,5,6};
			int arr2[]= {3,2,4,6,8};
			mergeArrays(arr1,arr2);
			System.out.println("---Merge Array-----");
			int mergeArr[]=mergeArrays(arr1, arr2);
		
				for(int a:mergeArr) {
					if(a!=0)
					System.out.print(a+" ");
		
	}
	}
}
