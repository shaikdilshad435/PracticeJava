package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution9 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	factArray(arr);
}
static void factArray(int arr[]) {
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(fact(arr[i])+" ");
		
	}

}
static int fact(int n) {
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	return fact;
}
}
