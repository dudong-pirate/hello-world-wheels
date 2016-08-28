//package com.bjsxt.com.bjsxt.spring;
//
//import org.jdom2.Document;
//import org.jdom2.Element;
//import org.jdom2.JDOMException;
//import org.jdom2.input.SAXBuilder;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by Du on 16/6/3.
// */
//public class ClassPathXmlApplicationContext implements BeanFactory{
//
//    private Map<String, Object> beans = new HashMap<String, Object>();
//
//    public ClassPathXmlApplicationContext() throws JDOMException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        SAXBuilder sb = new SAXBuilder();
//        Document document = sb.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
//        Element root = document.getRootElement();
//        List list = root.getChildren("bean");
//        for (int i=0; i < list.size(); i++) {
//            Element element = (Element) list.get(i);
//            String id = element.getAttributeValue("id");
//            String clazz = element.getAttributeValue("class");
//            System.out.println(id + ":" + clazz);
//            Object o = Class.forName(clazz).newInstance();
//            beans.put(id, o);
//        }
//
//    }
//
//    public Object getBean(String name) {
//        return beans.get(name);
//    }
//}
