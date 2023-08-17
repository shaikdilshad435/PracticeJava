package com.kodnest.methodswithoperator;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(countSetBit(n));
	}
static int countSetBit(int n) {
	int count=0;
	while(n!=0) {
		n=n&(n-1);
		count++;
	}
	return count;
}
}
