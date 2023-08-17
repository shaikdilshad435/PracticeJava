package com.kodnest.guessthenumbergame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		int num=ran.nextInt(100);
		System.out.println("random number is "+num);
		System.out.println("enter input");
		int input=scan.nextInt();
		int count=1;
		do
		{
			
			if(input<num) {
				System.out.println("Too low! Try again.");
			}
			else if(input>num) {
				System.out.println("Too high! Try again.");
				}
			count++;
			System.out.println("Enter your guess:");
			 input=scan.nextInt();
		}while(num!=input);
		System.out.println("Congratulations! You guessed the number"+input+" It took you "+count+" attempts.");
		
	
	}

}
