package com.kodnest.pattern.level4;

public class Pattern11 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			if(i==1 ||i==3) {
				for(int j=1;j<=3;j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=1;j<=3;j++) {
					if(j==1 ||j==3) {
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
