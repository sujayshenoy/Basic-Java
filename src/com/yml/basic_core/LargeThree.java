package com.yml.basic_core;

import java.io.PrintWriter;
import java.util.*;

public class LargeThree {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		print("Enter three numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a > b && a > c)
			print(""+a+" is the largest number");
		else if(b > a && b > c)
			print(""+b+" is the largest number");
		else
			print(""+c+" is the largest number");

	}
	
	private static void print(String msg) {
		
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
		
	}
	
}
