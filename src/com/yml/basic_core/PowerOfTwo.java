package com.yml.basic_core;

import java.io.PrintWriter;

public class PowerOfTwo {
	
	public static void run(String args[]) {
		
		int power = Integer.parseInt(args[0]);
		
		for(int i=0;i<=power;i++) {
			
			if(i > 31) {
				print("Integer Overflow");
				break;
			}
			
			print("2^"+i+" = "+(int)Math.pow(2, i));
			
		}
		
	}
	
	private static void print(String msg) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
	}
	
}
