package com.kodnest.array.level3;

import java.util.Scanner;

public class LinearSearchApp {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enetr array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("enter key to search");
	int key=scan.nextInt();
	int res=linearSearch(arr, key);
	if(res>=0) {
		System.out.println("Key found at "+res);
	}
	else {
		System.out.println("key not found");
	}
}
static int linearSearch(int arr[],int key) {
	for(int i=0;i<arr.length;i++) {
		if(key==arr[i]) {
			
			return i;
		}
		
	}
	return -1;
	
}

}
