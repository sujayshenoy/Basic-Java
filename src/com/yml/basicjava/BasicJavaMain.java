package com.yml.basicjava;

import java.io.PrintWriter;
import java.util.Scanner;

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
		Scanner in = new Scanner(System.in);

		// int d = Integer.parseInt(args[0]);
		// int m = Integer.parseInt(args[1]);
		// int y = Integer.parseInt(args[2]);

		// int day = Util.dayOfWeek(d, m, y);
		// out.println("Day of the week: " + day);

		out.println("Choose the Temperature type\n1. Enter in Celsius\n2. Enter in Farenheit");
		int ch = in.nextInt();

		while(ch <= 0 || ch >= 3){
			out.println("Invalid Option");
			ch = in.nextInt();
		}

		out.println("Enter the temperature");
		double temp = in.nextDouble();

		double result = 0;
		char tempType = ' ';
		switch(ch){
			case 1: 
				tempType = 'C';
				break;
			case 2:
				tempType = 'F';
		}
		result = Util.temperatureConversion(temp, tempType);
		if(tempType == 'C')
			out.println("Temperature in Farenheit: "+String.format("%.2f", result));
		else
			out.println("Temperature in Celsius: "+String.format("%.2f", result));

		in.close();
		out.close();
	}
	
}
