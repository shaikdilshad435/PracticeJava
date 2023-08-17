package com.kodnest.insertionsort;

public class SelectionSort {
void selectionSort(int a[]) {
	for(int i=1;i<a.length;i++) {
		int item=a[i];
		int j=i-1;
		while(j>=0&&a[j]>item) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=item;
		for (int x: a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
}
