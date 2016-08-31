package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2016/8/26.
 */
public class Audience {

    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones.");
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP!!");
    }

    public void demandRefund() {
        System.out.println("Boo!! We want our money back!!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {

        System.out.println("The audience is taking their seats.");
        System.out.println("The audience is turning off their cellphones.");
        long start = System.currentTimeMillis();

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("CLAP CLAP CLAP CLAP");
        System.out.println("The performance took " + (end - start) + " milliseconds.");

    }
}
