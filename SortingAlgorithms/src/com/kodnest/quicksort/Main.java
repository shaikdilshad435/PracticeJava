package com.kodnest.quicksort;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.print ("before sorting: ");
	for (int i : arr) {
		System.out.print(i+" ");
	}System.out.println();
	QuickSort quick=new QuickSort();
	quick.quickSort(arr, 0, arr.length-1);
	System.out.print("after sorting: ");
	for (int i : arr) {
		System.out.print(i+" ");
	}
	
}
}
