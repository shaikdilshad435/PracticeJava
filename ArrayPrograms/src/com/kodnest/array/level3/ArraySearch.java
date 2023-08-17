package com.kodnest.array.level3;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter target to search");
	int target=scan.nextInt();
	Search search=new Search();
	boolean res=search.isPresent(target);
	if(res==true) {
		System.out.println(" Target is Present");
	}
	else {
		System.out.println("Target is not present");
	}
}
}