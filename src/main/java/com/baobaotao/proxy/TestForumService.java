package com.baobaotao.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Du on 16/6/5.
 */
public class TestForumService {

    public static void main(String[] args) {
        ForumService target = new ForumServiceImpl();

        PerformanceHandler handler = new PerformanceHandler(target);
        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );
        proxy.removeForum(10);
        proxy.removeTopic(10002);
    }

}
