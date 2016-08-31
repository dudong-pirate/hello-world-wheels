package com.springinaction.springidol;

/**
 * Created by Administrator on 2016/8/24.
 */
public class Saxophone implements Instrument {

    public Saxophone() {
    }

    public void play() {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Toot! Saxophone playing...");
    }
}
