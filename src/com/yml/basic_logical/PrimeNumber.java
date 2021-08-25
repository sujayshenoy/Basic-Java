package com.yml.basic_logical;

import java.io.PrintWriter;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Enter the number");
		int number = in.nextInt();
		
		if(isPrime(number)) {
			out.println(""+number+" is a prime number");
		}
		else
			out.println(""+number+" is not a prime number");
		
		in.close();
		out.close();
	}
	
	static boolean isPrime(int n) {
		
		if( n == 2 )
			return true;
		
		for(int i=2;i<n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
