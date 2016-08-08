package com.bjsxt.dao.impl;

import com.bjsxt.com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

import java.util.Set;

/**
 * Created by Du on 16/6/1.
 */
public class UserDAOImpl implements UserDAO {

    private Set sets;

    public Set getSets() {
        return sets;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public void save(User user) {
        System.out.println("a user saved!");
    }
}
