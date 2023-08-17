package com.kodnest.methodswithcontrolconstructs;

import java.util.Scanner;

public class Solution3 {
static int primeNumbersRange(int n1,int n2) {
	int count=0;
	for(int i=n1;i<=n2;i++) {
		int c=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				c++;
			}
		}
		if(c<=2) {
			System.out.print(i+" ");
			count++;
		}
		
	}System.out.println();
	return count;
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two numbers to find the range of prime numbers");
	int n1=scan.nextInt();
	int n2=scan.nextInt();
	System.out.println(primeNumbersRange(n1, n2));
}
}
