package com.kodnest.array.level1;

import java.util.Scanner;

public class SwapArrayIndexes {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+"array elements of");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(" Before swapping");
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("enter two indexes");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int temp;
	temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
	
	System.out.println("After swapping");
	for (int i : arr) {
		System.out.print(i+" ");
	}
}
}
