package com.yml.basic_logical;

import java.io.PrintWriter;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Coupon {
	
	static List<Integer> coupons = new ArrayList<Integer>();

	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Number of codes?");
		int n = in.nextInt();		
		
		out.println("Enter the coupon codes");
		
		while(n-- > 0) {
			coupons.add(in.nextInt());
		}
		
		generateCoupon();
		
		out.close();
		in.close();
	}

	private static void generateCoupon() {
		
		int count = 0;
		int finalCode = 0;
		PrintWriter out = new PrintWriter(System.out,true);
		
		while(true){
			count++;
			int code = nextCoupon();
			if(isUnique(code)){
				finalCode = code;
				break;
			}
		}

		out.println("Coupon Code generated: "+finalCode);
		out.println(count+" random coupon/s generated to generate this unique coupon");
		
		out.close();
	}

	private static boolean isUnique(int code) {

		int res = Collections.binarySearch(coupons, code);
		if(res < 0)
			return true;
		else
			return false;

	}

	private static int nextCoupon(){

		Random rand = new Random();
		int coupon = rand.nextInt(9);
		return coupon;

	}
	
}
