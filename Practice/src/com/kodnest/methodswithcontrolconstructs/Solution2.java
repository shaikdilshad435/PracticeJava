package com.kodnest.methodswithcontrolconstructs;

import java.util.Scanner;

public class Solution2{
	static int countDivisors(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("nter a number to find the possinble divisors");
	int n=scan.nextInt();
	System.out.println(countDivisors(n));
	}
}
