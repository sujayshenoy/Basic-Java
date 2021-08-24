package com.yml.basic_core;

import java.io.PrintWriter;
import java.util.*;

public class VowelConsonent {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		print("Enter the Character");
		char c = in.next().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			print(c+" is a vowel");
		}
		else
			print(c+" is a consonent");
		
		
		
	}
	
	private static void print(String msg) {
		
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
		
	}
	
}
