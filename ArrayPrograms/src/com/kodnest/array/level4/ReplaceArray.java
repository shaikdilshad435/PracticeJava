package com.kodnest.array.level4;

import java.util.Scanner;

public class ReplaceArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	
	System.out.println("Before replacing");
	for (int x : arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("After replacing");
	replace(arr);
	for (int x: arr) {
		System.out.print(x+" ");
	}
}
static void replace(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<0) {
			arr[i]=0;
		}
	}
	
}
}
