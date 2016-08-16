package com.springinaction.springidol;

/**
 * Created by Administrator on 2016/7/24.
 */
public class Sonnet29 implements Poem {

    private static String[] LINES = {
        "When, in disgrace with fortune and men's eyes, ",
            "I all alone beweep my outcast state",
            "And trouble deaf heaven with my bootless cries"
    };

    public Sonnet29() {
    }

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
