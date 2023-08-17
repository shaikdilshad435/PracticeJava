package com.kodnest.array.level1;

import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter length of array ");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter array elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("positive array elements are");
	for(int a:arr) {
		if(a>0) {
			System.out.println(a);
		}
	}
}
}
