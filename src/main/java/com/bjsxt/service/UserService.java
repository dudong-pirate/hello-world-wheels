package com.bjsxt.service;

import com.bjsxt.com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;

/**
 * Created by Du on 16/6/1.
 */
public class UserService {

    private UserDAO userDAO = new UserDAOImpl();

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(User user) {
        userDAO.save(user);
    }

}
