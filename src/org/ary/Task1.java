package org.ary;

public class Task1 {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		// no of elements
		int len = a.length;
		System.out.println("No of elements: " + len);
		
		// sum of array
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum= sum+a[i];
			
		}
		System.out.println("sum of the array: " + sum);
		
		
	}

}
