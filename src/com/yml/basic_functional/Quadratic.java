package com.yml.basic_functional;

import java.util.*;
import java.io.*;

public class Quadratic {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Enter value for a");
		int a = in.nextInt();
		out.println("Enter value for b");
		int b = in.nextInt();
		out.println("Enter value for c");
		int c = in.nextInt();
		
		double delta = Math.pow(b, 2) - (4*a*c);
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		
		out.println("Two roots are: ");
		out.println("Root 1: "+String.format("%.4f", root1));
		out.println("Root 2: "+String.format("%.4f", root2));
		
	}
	
}
