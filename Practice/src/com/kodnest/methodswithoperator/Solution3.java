package com.kodnest.methodswithoperator;

import java.util.Scanner;

public class Solution3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int y=scan.nextInt();
	swapUsingBitwise(x, y);
	
}
static void  swapUsingBitwise(int x,int y) {
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.println("x= "+x+" y= "+y);
}
}
