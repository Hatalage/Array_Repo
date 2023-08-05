package com.arrayprograms;

public class FindEvenNums {
	public static void findEvenNums(int arr[]) {
			int i,len=arr.length;
			
			/*
			 * for(i=0;i<len;i++) { if(a[i]%2==0) { System.out.println(a[i]); } }
			 */
			for(int e:arr ) {
				if(e%2==0) {
					System.out.println(e);
				}
			}
			//task comment for loop and use for-each loop
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int number[]= {12,10,7,9,24,15};
			System.out.println("Even Numbers From array");
			findEvenNums(number);
		}

	}

