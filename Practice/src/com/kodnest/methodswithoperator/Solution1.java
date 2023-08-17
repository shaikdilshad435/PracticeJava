package com.kodnest.methodswithoperator;

import java.util.Scanner;

public class Solution1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double purchaseamount=scan.nextDouble();
	double  taxrate=scan.nextDouble();
	double res=calculateTotalWithTax(purchaseamount, taxrate);
	System.out.println((Math.round(res)));
	
}
static double calculateTotalWithTax(double purchaseamount ,double taxrate) {
	double tax=purchaseamount * taxrate;
	purchaseamount=purchaseamount+tax;
	return purchaseamount;
}
}
