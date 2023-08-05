package org.example;

import org.example.pointcuts.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Item item = (Item) applicationContext.getBean("itemBeanOne");

        System.out.println("Item:" + item.toString());
        item.printItemDetails();
    }
}