package com.yml.basic_logical;

import java.io.PrintWriter;
import java.util.Scanner;

public class Fibonacci {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Enter the value of n");
		int n = in.nextInt();
		
		out.println("Fibonacci Series upto "+n+" terms");
		printFibo(n);
		
		in.close();
		out.close();
		
	}
	
	static void printFibo(int n) {
		
		PrintWriter out = new PrintWriter(System.out,true);

		int prev = 0;
		int cur = 1;
		
		out.print(prev+" ");
		out.print(cur+" ");
		out.flush();
		
		for(int i=2;i<n;i++) {
			
			int next = prev + cur;
			
			out.print(next+" ");
			
			prev = cur;
			cur = next;
			
			out.flush();
			
		}
		
	}
	
}
