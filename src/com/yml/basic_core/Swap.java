package com.yml.basic_core;

import java.io.PrintWriter;
import java.util.*;

public class Swap {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		print("Enter the value for a");
		int a = in.nextInt();
		
		print("Enter the value for b");
		int b = in.nextInt();
		
		
		print("Swapping value");
		int temp = a;
		a = b;
		b = temp;
		
		print("a = "+a+"\nb = "+b);
		
		
	}
	
	private static void print(String msg) {
		
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
		
	}
	
}
