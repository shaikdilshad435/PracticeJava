package com.kodnest.array.level3;

import java.util.Scanner;
public class SumofArray {
public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enetr array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int res=sumArray(arr);
		System.out.println("Sum of array elements is : "+res);

	}
static int sumArray(int arr[]) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	return sum;
}
}
