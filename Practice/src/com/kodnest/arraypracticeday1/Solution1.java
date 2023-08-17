package com.kodnest.arraypracticeday1;

import java.util.Scanner;

public class Solution1 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int arrgrade[]=new int[scan.nextInt()];
	for(int i=0;i<arrgrade.length;i++) {
		arrgrade[i]=scan.nextInt();
	}
	System.out.println("students scored above 75 are: "+gradecount(arrgrade));
}
static int gradecount(int arrgrade[]) {
int count=0;
for(int i=0;i<arrgrade.length;i++) {
	if(arrgrade[i]>75) {
		count++;
	}
}
return count;
}
}
