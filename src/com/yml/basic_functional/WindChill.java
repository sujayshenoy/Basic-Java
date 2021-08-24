package com.yml.basic_functional;

import java.io.PrintWriter;

public class WindChill {
	
	public static void run(String args[]) {
		
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		
		PrintWriter out = new PrintWriter(System.out,true);
		
		double w = calculateWindChill(t,v);
		
		out.println("Wind Chill: "+ String.format("%.4f", w));		
		
	}
	
	static double calculateWindChill(double t,double v) {
		return 35.74 + (0.6215*t) + ((0.4275*t)-35.75)*Math.pow(v, 0.16);
	}
	
}
