package com.springinaction.springidol;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Du on 16/8/14.
 */
public class JugglerTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                ".\\spring_beans_cfg.xml");
        Performer performer = (Performer) context.getBean("Duke");
        performer.perform();
    }

    /**
     *  通过构造器注入 同时抛25个豆袋子
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                ".\\spring_beans_cfg.xml");
        Performer performer = (Performer) context.getBean("Duke");
        performer.perform();
    }

    /**
     *  Spring中使用 factory-method 将单例类配置为Bean
     */
    @Test
    public void test_factory_method() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                ".\\spring_beans_cfg.xml");
        Stage stage = (Stage) context.getBean("theStage");
        stage.show();
    }

    /**
     *  Spring Bean 默认都是单例
     *  为了让Spring在每次请求时都获得唯一的Bean实例,我们只需要配置Bean的scope属性为prototype
     */
    @Test
    public void test_bean_scope() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                ".\\spring_beans_cfg.xml");
//        Juggler performer1 = (Juggler) context.getBean("Duke");
//        performer1.setAge(88);
//        performer1.perform();

        Performer performer2 = (Performer) context.getBean("Duke");
        performer2.perform();
    }

    @Test
    public void testUseSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                ".\\spring_beans_cfg.xml");
        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();
    }


    @Test
    public void testRefOtherBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                ".\\spring_beans_cfg.xml");
        Performer performer = (Performer) context.getBean("kenny2");
        performer.perform();
    }

    @Test
    public void testSetCollections() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                ".\\spring_beans_cfg.xml");
        Performer performer = (Performer) context.getBean("hank");
        performer.perform();
    }

}