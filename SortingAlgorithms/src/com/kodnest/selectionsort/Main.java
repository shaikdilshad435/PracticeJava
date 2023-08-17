package com.kodnest.selectionsort;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter array elements ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Before sorting array elements are ");
	for (int i : arr) {
		System.out.print(i+" ");
	}System.out.println();
	SelectionSort sort=new SelectionSort();
	sort.selectionSort(arr);
	System.out.println("After sorting array elements are ");
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
}
}
