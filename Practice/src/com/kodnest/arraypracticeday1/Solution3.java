package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(smallest(arr));
}
static int smallest(int arr[]) {
	int small=arr[0];
	for(int i=1;i<arr.length;i++) {
		
		int big=arr[i];
		if(small>big) {
			small=big;
		}
	}
	return small;
}
}
