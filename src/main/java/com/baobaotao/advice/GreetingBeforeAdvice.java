package com.baobaotao.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Du on 16/6/5.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {



    public void before(Method method, Object[] args, Object obj) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("How are you! Mr." + clientName + ".");
    }
}
