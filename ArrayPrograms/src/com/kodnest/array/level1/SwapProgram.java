package com.kodnest.array.level1;

import java.util.Scanner;

public class SwapProgram {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two numbers to swap");
	int x=scan.nextInt();
	int y=scan.nextInt();
	System.out.println("Before swapping "+x+" "+y);
	swap(x, y);
//	int temp=x;
//	x=y;
//	y=temp;
//	System.out.println("After swapping "+x+" "+y);
}
static void swap(int a,int b) {
	int temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping "+a+" "+b);
}
}
