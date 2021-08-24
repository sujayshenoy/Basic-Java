package com.yml.basic_core;

import java.io.PrintWriter;
import java.util.*;

public class QuotientRemainder {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		print("Enter two numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		
		int quotient = a/b;
		int remainder = a%b;
		
		print("Quotient: "+quotient);
		print("Remainder: "+remainder);
		
	}
	
	private static void print(String msg) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
	}
	
}
