package com.yml.basic_core;

import java.io.PrintWriter;

public class PowerOfTwo {
	
	public static void run(String args[]) {
		
		int power = Integer.parseInt(args[0]);
		
		while(power<0 || power > 31) {
			print("Power should be between 0 and 31");
			System.exit(0);
		}
		
		for(int i=0;i<=power;i++) {
			
			print("2^"+i+" = "+(int)Math.pow(2, i));
			
		}
		
	}
	
	private static void print(String msg) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
	}
	
}
