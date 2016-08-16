package com.springinaction.springidol;

/**
 * Created by Administrator on 2016/7/24.
 */
public class Juggler implements Performer {

    private int age = 5;

    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS and Age is " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
