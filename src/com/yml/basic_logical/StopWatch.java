package com.yml.basic_logical;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    
    public static long startTime, stopTime;

    public static void run(){

        Scanner in = new Scanner(System.in);

        System.out.println("Press 1 to start the clock");
        int n = in.nextInt();

        if(n == 1)
            startTimer();

        System.out.println("Press 2 to stop the clock");
        n=in.nextInt();

        while(n!=2){
            n=in.nextInt();
        }

        stopTimer();
        long totalTime = stopTime - startTime;

        long differenceInHours = (totalTime / (1000 * 60 * 60)) % 24;
        long differenceInMinutes = (totalTime / (1000 * 60)) % 60;
        long differenceInSeconds = (totalTime / 1000) % 60 + 1;

        System.out.println("Elapsed Time: ");
        System.out.println(differenceInHours+":"+differenceInMinutes+":"+differenceInSeconds);

        in.close();

    }

    public static void startTimer()
	{
		startTime = System.currentTimeMillis();
        System.out.println("Stop watch started");
        printTime(startTime);
	}
	
	public static void stopTimer()
	{
		stopTime=System.currentTimeMillis();
		System.out.println("Stop watch stopped");
		printTime(stopTime);
	}

    public static void printTime(long time){
        Date date = new Date(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println("time = "+simpleDateFormat.format(date));
    }

}
