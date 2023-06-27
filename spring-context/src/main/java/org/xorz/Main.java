package org.xorz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the person bean from the context
        Person person = context.getBean("personBean", Person.class);

        // Use the person bean
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Close the Spring context
        ((ClassPathXmlApplicationContext) context).close();
    }
}