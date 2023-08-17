package com.kodnest.array.level4;

import java.util.Scanner;

public class QuestionSolution1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
	int arr1[]=new int[scan.nextInt()];

	int arr2[]=new int[arr1.length];
	System.out.println("enter array1 elements");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("enter array2 elements");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=scan.nextInt();
	}
	Merge m=new Merge();
	int res[]=m.merge(arr1, arr2);
	for (int x : res) {
		System.out.print(x+" ");
		
	}
}
}
