package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(evencount(arr));
}
static int evencount(int arr[]) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			count++;
		}
	}
	return count;
}
}
