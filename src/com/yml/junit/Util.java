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

    public static double temperatureConversion(double temp, char type){
        if(type == 'F'){
            return (temp-32)*((double)5/9);
        }
        else{
            return (temp*(9/5)) + 32;
        }
    }

    public static double monthlyPayment(double principal, int year, double rate){
        
        double effectiveRate = rate / (12 * 100);
        double n = 12 * year;

        return (principal*effectiveRate)/(1-Math.pow(1+effectiveRate, -n));

    }

}