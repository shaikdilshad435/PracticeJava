package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(averagetemp(arr));
}
static int averagetemp(int arr[]) {
	int avg;
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	avg=sum/arr.length;
	return avg;
}
}
