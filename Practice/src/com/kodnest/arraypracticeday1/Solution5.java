package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution5 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(sumPositive(arr));
}
static int sumPositive(int arr[]) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			sum=sum+arr[i];
		}
	}
	return sum;
}
}
