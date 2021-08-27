package com.yml.junit;

import java.io.PrintWriter;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Scanner;

public class VendingMachine {
	private static SortedMap<Integer,Integer> change = new TreeMap<Integer,Integer>(Collections.reverseOrder());
	private static int count = 0;
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Enter Change in Rs to be returned by the vending machine");
		int amount = in.nextInt();
		
		returnChange(amount);
		
		out.println(change);
		out.println(count);

	}

	private static void returnChange(int amount) {

		if(amount == 0)
			return ;

		count++;
		if(amount/1000 > 0){
			change.put(1000,amount/1000);
			returnChange(amount%1000);
			return;
		}
		if(amount/500 > 0){
			change.put(500,amount/500);
			returnChange(amount%500);
			return;
		}
		if(amount/100 > 0){
			change.put(100,amount/100);
			returnChange(amount%100);
			return;
		}
		if(amount/50 > 0){
			change.put(50,amount/50);
			returnChange(amount%50);
			return;
		}
		if(amount/10 > 0){
			change.put(10,amount/10);
			returnChange(amount%10);
			return;
		}
		if(amount/5 > 0){
			change.put(5,amount/5);
			returnChange(amount%5);
			return;
		}
		if(amount/2 > 0){
			change.put(2,amount/2);
			returnChange(amount%2);
			return;
		}
		if(amount/1 > 0){
			change.put(1,amount/1);
			returnChange(amount%1);
			return;
		}
		
	}
	
	
	
}
