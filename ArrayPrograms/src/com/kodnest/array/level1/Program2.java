package com.kodnest.array.level1;

import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter length of array");
	int []arr=new int[scan.nextInt()];
	System.out.println("enter "+arr.length+"array elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Array contents are");
	for (int i : arr) {
		System.out.println((i+5)+" ");
		
	}
}
}
