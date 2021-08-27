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

		// out.println("Choose the Temperature type\n1. Enter in Celsius\n2. Enter in Farenheit");
		// int ch = in.nextInt();

		// while(ch <= 0 || ch >= 3){
		// 	out.println("Invalid Option");
		// 	ch = in.nextInt();
		// }

		// out.println("Enter the temperature");
		// double temp = in.nextDouble();

		// double result = 0;
		// char tempType = ' ';
		// switch(ch){
		// 	case 1: 
		// 		tempType = 'C';
		// 		break;
		// 	case 2:
		// 		tempType = 'F';
		// }
		// result = Util.temperatureConversion(temp, tempType);
		// if(tempType == 'C')
		// 	out.println("Temperature in Farenheit: "+String.format("%.2f", result));
		// else
		// 	out.println("Temperature in Celsius: "+String.format("%.2f", result));
		
		// double principal = Double.parseDouble(args[0]);
		// int year = Integer.parseInt(args[1]);
		// double rate = Double.parseDouble(args[2]);

		// double monthlyPayment = Util.monthlyPayment(principal, year, rate);

		// out.println("Monthly Payment: "+String.format("%.2f", monthlyPayment));

		// out.println("Enter a non negative number of which the square root has to be computed");
		// int c = in.nextInt();
		// double result = Util.sqrt(c);
		// out.println("Square root of "+c+" is : "+result);
		
		// out.println("Enter the decimal number to be converted to binary");
		
		// int num = in.nextInt();
		// while (num < 0) {
		// 	System.out.println("Please enter a positive number");
		// 	num = in.nextInt();
		// }
		
		// Util.toBinary(num);

		Binary.run();

		in.close();
		out.close();
	}
	
}
