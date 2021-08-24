package com.yml.basic_core;

import java.io.PrintWriter;
import java.util.*;

public class EvenOdd {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		print("Enter the number");
		int n = in.nextInt();
		
		if(n%2 == 0)
			print(""+n+" is even");
		else
			print(""+n+" is odd");
		
		
	}
	
	private static void print(String msg) {
		
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
		
	}
	
}
