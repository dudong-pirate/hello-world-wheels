package com.baobaotao.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Du on 16/6/5.
 */
public class TestBeforeAdvice {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("Du");

        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        // 1、Spring提供的代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();

        // 2、设置代理目标
        proxyFactory.setTarget(target);

        // 3、为代理目标添加增强
        proxyFactory.addAdvice(advice);

        // 4、生成代理实例
        Waiter proxy = (Waiter)proxyFactory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }

}
