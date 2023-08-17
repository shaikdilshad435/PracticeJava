package com.kodnest.array.level2;

import java.util.Scanner;

public class PrintArrayApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	PrintArray print=new PrintArray();
	System.out.println("enter array length");
	int []arr=new int[scan.nextInt()];
	System.out.println("enter "+arr.length+"elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	print.printArray(arr);
}

}
