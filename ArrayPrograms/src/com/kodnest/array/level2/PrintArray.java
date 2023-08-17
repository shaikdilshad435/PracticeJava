package com.kodnest.array.level2;

public class PrintArray {
void printArray(int arr[]) {
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}
}
