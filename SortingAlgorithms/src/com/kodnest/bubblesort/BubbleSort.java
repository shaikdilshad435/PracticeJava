package com.kodnest.bubblesort;
public class BubbleSort {
void bubbleSort(int arr[]) {
	int help;
	for(int i=0;i<=arr.length-2;i++) {
		for(int j=0;j<=arr.length-2-i;j++) {
			if(arr[j]<arr[j+1]) {
				help=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=help;
			}
		}
	}
}
}
