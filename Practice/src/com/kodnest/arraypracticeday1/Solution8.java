package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution8 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	primeArray(arr);
}
static void primeArray(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=1;j<arr[i];j++) {
			if(arr[i]%j==0) {
				count++;
			}
		}
		if(count<2) {
			System.out.print(arr[i]+" ");
		}
	}

}
}
