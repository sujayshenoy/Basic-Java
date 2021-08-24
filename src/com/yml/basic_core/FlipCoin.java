package com.yml.basic_core;
import java.io.PrintWriter;
import java.util.*;

public class FlipCoin {
	
	final static int HEAD_FLAG = 0;
	final static int TAIL_FLAG = 1;
	
	static int count[] = new int[2];
	
	public static void run() {
			
		Scanner in = new Scanner(System.in);
		

		print("Enter number of times to flip the coin");
		int n = in.nextInt();
		
		while(n < 0) {
			print("Enter a Positive Integer");
			n = in.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			flip();
		}
		
		int perc = getHeadPercentage();
		print("HEAD Percentage: "+perc+"%");
		print("TAIL Perentage: "+(100-perc)+"%");
		
		in.close();
		
	}
	
	private static void flip() {
		
		print("Flipping Coin");
		
		double prob = Math.random();
		if(prob < 0.5) {
			print("Landed on Tail");
			count[TAIL_FLAG]++;
		}
			
		else {
			print("Landed on Head");
			count[HEAD_FLAG]++;
		}
		print("");
	}
	
	private static void print(String msg) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
	}
	
	private static int getHeadPercentage() {
		
		int headCount = count[HEAD_FLAG];
		int tailCount = count[TAIL_FLAG];
		int perc;
		
		if( headCount == 0 )
			perc = 0;
		else if ( tailCount == 0 )
			perc = 100;
		else
			perc = (headCount*100)/(headCount+tailCount);
		
		print("HEAD: "+headCount);
		print("TAIL: "+tailCount);
		print("");
		
		return perc;
			
	}
	
}
