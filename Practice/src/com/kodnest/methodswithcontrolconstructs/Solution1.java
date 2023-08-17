package com.kodnest.methodswithcontrolconstructs;

import java.util.Scanner;

public class Solution1 {
static int factsum(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		int fac=1;
		for(int j=1;j<=i;j++) {
			fac=fac*j;
		}
		sum=sum+fac;
		
	}
	return sum;
}

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the range to find the factsum");
	int n=scan.nextInt();
	System.out.println(factsum(n));
}
}
