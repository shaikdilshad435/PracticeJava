package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution10 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	duplicateElements(arr);
}
static void duplicateElements(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("  duplicate elements are prsent");
			return;
			}
		}
	}
	System.out.println("no duplicates");
}
}
