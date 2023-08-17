package com.kodnest.array.level3;

import java.util.Scanner;

public class Search {
	
 boolean isPresent(int target) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enetr array length");
	 int arr[]=new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				return true;
			}
		}
	 return false;
 }
}
