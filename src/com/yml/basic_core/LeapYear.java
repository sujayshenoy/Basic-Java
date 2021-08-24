package com.yml.basic_core;

import java.util.*;
import java.io.*;

public class LeapYear {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		print("Enter the year");
		int year = in.nextInt();
		
		while( year<1000 || year < 0 || year>=10000) {
			print("Year should be a 4 digit positive number");
			year = in.nextInt();
		}
		
		if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
			print(""+year+" is a leap year");
		}
		else {
			print(""+year+" is not a leap year");
		}
		
	}
	
	private static void print(String msg) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
	}
	
}
