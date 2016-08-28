package com.bjsxt.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
 * Created by Du on 16/6/15.
 */

@Aspect
@Component
public class LogInterceptor {

    @Before("execution(public void com.bjsxt.dao.impl.UserDAOImpl .save(com.bjsxt.model.User))")
    public void beforeMethod() {
        System.out.println("Method start");
    }

}
