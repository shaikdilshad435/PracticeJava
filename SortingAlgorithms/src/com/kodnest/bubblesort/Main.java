package com.kodnest.bubblesort;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Array elements before sorting");
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	BubbleSort sort=new BubbleSort();
	sort.bubbleSort(arr);
	System.out.println("array elements after sorting");
	for (int i : arr) {
		System.out.print(i+" ");
	}
}
}
