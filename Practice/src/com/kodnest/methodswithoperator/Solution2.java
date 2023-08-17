package com.kodnest.methodswithoperator;

import java.util.Scanner;

public class Solution2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Is input valid: ");
	boolean isinputvalid=scan.nextBoolean();
	System.out.println("Is input matching certain condition: ");
	boolean meetcertaincondition=scan.nextBoolean();
	boolean isvalid=isValidInput(isinputvalid, meetcertaincondition);
	if(isvalid) 
		System.out.println("true");
	else
		System.out.println("false");
	
}
static boolean isValidInput(boolean n1,boolean n2) {
	if(n1&&n2) 
		return true;
	
	else
	return false;
}
}
