package com.kodnest.array.level4;

public class SumMerge {
int[] merge(int arr1[],int arr2[]) {
	int []res=new int[arr1.length];
	int i=0;
	while(i<res.length) {
		res[i]=arr1[i]+arr2[i];
		i++;
	}
	return res;
}
}
