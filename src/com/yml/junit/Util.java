package com.yml.junit;

final public class Util {
    
    private Util(){

    }

    public static int dayOfWeek(int d, int m,int y){ 
		int y0=0, x=0, m0=0, d0=0;
		
		y0 = y - (14-m)/12;
		x = y0 + (y0/4) - (y0/100) + (y0/400);
		m0 = m + 12 * ((14-m)/12)-2;
		d0 = (d+x+(31*m0)/12)%7;

        return d0; 
    }

}
