package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(mulElements(arr));
}
static int mulElements(int arr[]) {
	int mul=1;
	for(int i=0;i<arr.length;i++) {
		mul=mul*arr[i];
	}
	return mul;
}
}
