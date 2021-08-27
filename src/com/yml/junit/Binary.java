package com.yml.junit;

import java.util.Scanner;

public class Binary {
    
    public static void run(){
        Scanner in = new Scanner(System.in);

		System.out.println("Enter the value:");
		int x = in.nextInt();

		Util.toBinary(x);

		int swapValue = swapNibbles(x);

		System.out.println("\nAfter Swapping\n");
		Util.toBinary(swapValue);
		System.out.println("\nnew number: "+swapValue);

		int powerOf2check = powerOfTwo(swapValue);
		if(powerOf2check==1)
			System.out.println("\n"+swapValue+" is a power of 2");
		else
			System.out.println("\n"+swapValue+" is a not a power of 2");
    }

    private static int swapNibbles(int x)
	{
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

    private static int powerOfTwo(int n)
    {
        if(n==0) { return 0; }
        while(n != 1)
        {
            n = n/2;
            if(n%2 != 0 && n != 1){ return 0; }
        }
        return 1;
    }

}
