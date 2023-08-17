package com.kodnest.selectionsort;

public class SelectionSort {
void selectionSort(int arr[]) {
	int min;
	int pos;
	for(int i=0;i<=arr.length-2;i++) {
		min=arr[i];
		pos=i;
		for(int j=i+1;j<=arr.length-1;j++) {
			if(min>arr[j]) {
				min=arr[j];
				pos=j;
			}
		}
		int help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
		System.out.println("Array elements for "+i+" sorting");
		for (int j : arr) {
			System.out.print(j+" ");
		}System.out.println();
	}
}
}
