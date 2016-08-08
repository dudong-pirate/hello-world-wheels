package com.bjsxt.dao.impl;

import com.bjsxt.aop.LogInterceptor;
import com.bjsxt.com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

/**
 * Created by Du on 16/6/15.
 */
public class UserDAOImpl3 implements UserDAO {

    private UserDAO userDAO = new UserDAOImpl();

    public void save(User user) {
        new LogInterceptor().beforeMethod();
        userDAO.save(user);
    }
}

