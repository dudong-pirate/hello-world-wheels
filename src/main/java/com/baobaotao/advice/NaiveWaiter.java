package com.baobaotao.advice;

/**
 * Created by Du on 16/6/5.
 */
public class NaiveWaiter implements Waiter {

    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("serving " + name + "...");

    }
}
