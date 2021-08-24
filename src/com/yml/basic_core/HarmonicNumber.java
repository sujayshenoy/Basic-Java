package com.yml.basic_core;

import java.io.PrintWriter;
import java.util.*;

public class HarmonicNumber {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		print("Enter value for n");
		int n = in.nextInt();
		
		while(n == 0) {
			print("n cannot be 0");
			n = in.nextInt();
		}
		
		double result = 1;
		
		for(int i=2;i<=n;i++) {
			result += (double)1/i;
		}
		
		print("Nth Harmonic number: "+String.format("%.4f", result));
		
		in.close();
		
	}
	
	private static void print(String msg) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
	}
	
}
