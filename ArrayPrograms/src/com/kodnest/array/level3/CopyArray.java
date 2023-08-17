package com.kodnest.array.level3;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enetr array length");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("array 1 elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int arr1[]=new int[arr.length];
		System.out.println("Array 2 elemebnts are");
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
