package com.kodnest.methodswithcontrolconstructs;

import java.util.Scanner;

public class Solution4 {
static int perfect(int n) {
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
		
	}
	return sum;
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scan.nextInt();
	int res=perfect(n);
	if(res==n) {
		System.out.println("perfect number");
	}
	else {
		System.out.println("not perfect bnumber");
	}
	
}
}
