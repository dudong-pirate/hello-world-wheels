package com.springinaction.springidol;

/**
 * Created by Administrator on 2016/7/24.
 */
public class Stage {

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }

    public void show() {
        System.out.println("The stage is beautiful!!");
    }

}
