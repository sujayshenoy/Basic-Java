package com.yml.basicjava;

import java.io.PrintWriter;

import com.yml.basic_core.*;
import com.yml.basic_functional.*;
import com.yml.basic_logical.*;
import com.yml.junit.*;


public class BasicJavaMain {

	public static void main(String[] args) {
		
		//Core Programs
		
//		FlipCoin.run();
//		
//		LeapYear.run();
//		
//		PowerOfTwo.run(args);
//		
//		HarmonicNumber.run();
//		
//		Factors.run();
//		
//		QuotientRemainder.run();
//		
//		Swap.run();
//		
//		EvenOdd.run();
//		
//		VowelConsonent.run();
//		
//		LargeThree.run();
		
		//Functional Programs
		
//		TwoDArray.run();
//		
//		Triplets.run();
//		
//		Distance.run(args);
//		
//		Quadratic.run();
//		
//		WindChill.run(args);
		
		//Logical Programs
		
//		Fibonacci.run();
//		PerfectNumber.run();
//		PrimeNumber.run();
		// VendingMachine.run();

		PrintWriter out = new PrintWriter(System.out,true);

		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);

		int day = Util.dayOfWeek(d, m, y);
		out.println("Day of the week: " + day);

	}
	
}
