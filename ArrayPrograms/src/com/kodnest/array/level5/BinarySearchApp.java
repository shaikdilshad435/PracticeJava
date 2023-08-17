package com.kodnest.array.level5;

import java.util.Scanner;

public class BinarySearchApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length +" array Elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter key to search ");
	int key=scan.nextInt();
	
	BinarySearch search=new BinarySearch();
	int res=search.findKey(arr, key);
	if(res>0) {
		System.out.println("Key found at index  "+res);
	}
	else {
		System.out.println("Key is not  found ");
	}
}
}
