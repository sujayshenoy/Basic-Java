package com.yml.basic_logical;

import java.io.PrintWriter;
import java.util.Scanner;

public class PerfectNumber {

	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Enter a number");
		int number = in.nextInt();
		
		if(isPerfect(number)) {
			out.println(""+number+" is a Perfect Number");
		}
		else
			out.println(""+number+" is not a Perfect Number");
		
		in.close();
		out.close();
		
	}
	
	static boolean isPerfect(int n) {
		
		int number = n;
		int sum = 0;

		for(int i=1;i<=n/2;i++) {
			
			if(n%i == 0) {
				sum += i;
			}
			
		}
		
		System.out.println(sum);
		
		if(sum == number)
			return true;
		else
			return false;
		
	}
	
}
