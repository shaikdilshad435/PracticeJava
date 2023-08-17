package com.kodnest.insertionsort;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
	int a[]=new int[scan.nextInt()];
	System.out.println("enetr array elements ");
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	System.out.println("before sorting");
	for (int i : a) {
		System.out.print(i+" ");
	}System.out.println();
	SelectionSort sort= new SelectionSort();
	sort.selectionSort(a);
	System.out.println("after sorting");
	for (int i : a) {
		System.out.print(i+" ");
	}
}
}
