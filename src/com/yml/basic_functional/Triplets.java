package com.yml.basic_functional;

import java.io.PrintWriter;
import java.util.*;

public class Triplets {
	
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		
		out.println("Enter the size of the array");
		int n = in.nextInt();
		int array[] = new int[n];
		
		out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			array[i] = in.nextInt();
		}
		
		Set<String> triplets = findTriplets(array, n);
		
		out.println("Number of distinct triplets: "+triplets.size());
		out.println("Distinct Triplets are: ");
		
		for(String item: triplets) {
			out.println(item);
		}
		
	}
	
	static Set<String> findTriplets(int array[], int n){
		
		Set<String> triplets = new HashSet<String>();
		
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++) {
					if((array[i]+array[j]+array[k]) == 0) {
						triplets.add("["+array[i]+" "+array[j]+" "+array[k]+"]");
					}
				}
		
		return triplets;
	}
	
}
