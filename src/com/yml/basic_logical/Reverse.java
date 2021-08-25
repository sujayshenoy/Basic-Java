package com.yml.basic_logical;

import java.io.PrintWriter;
import java.util.Scanner;

public class Reverse {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Enter the number to be reversed");
		int number = in.nextInt();
		
		int reversedNumber = reverse(number);
		
		out.println("Reversed Number: "+reversedNumber);
		
	}

	private static int reverse(int number) {
		
		int rev = 0;
		
		while(number > 0) {
			rev = rev*10 + number%10;
			number = number/10;
		}
		
		return rev;
		
	}
	
}
