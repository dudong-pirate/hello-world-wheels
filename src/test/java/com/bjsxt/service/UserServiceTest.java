package com.bjsxt.service;

import com.bjsxt.com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;
import org.jdom2.JDOMException;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Du on 16/6/2.
 */
public class UserServiceTest {

    @Test
    public void add() throws Exception {

        UserService service = new UserService();
        User user = new User();
        service.add(user);
    }

    @Test
    public void addUserBy_SelfMadeSpring() throws JDOMException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        UserDAO userDAO = (UserDAO) beanFactory.getBean("u");
        UserService userService = new UserService();
        userService.setUserDAO(userDAO);
        User user = new User();
        userService.add(user);
    }

    @Test
    public void addUserBy_Spring() throws JDOMException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) beanFactory.getBean("userService");
        User user = new User();
        userService.add(user);
    }

    @Test
    public void addUserBy_Spring_Collections() throws JDOMException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) beanFactory.getBean("userService");
        UserDAOImpl userDAO = (UserDAOImpl) beanFactory.getBean("u");
        System.out.println(userDAO.getSets());
    }

}