package com.kodnest.pattern.level4;

public class Pattern14 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(i==1||i==3||k==1||k==3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			if(i==1 ||i==5) {
				for(int j=1;j<=5;j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=1;j<=5;j++) {
					if(j==1 ||j==5) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}


	}

}
