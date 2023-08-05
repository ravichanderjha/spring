package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Annotaion AOP In-depth");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) applicationContext.getBean("student");

        student.setName("Argumentttttt", "seconddddddddddddddddd");
        student.setAge(20);

        System.out.println("-----------------------------");
        student.getAge();
        student.getName();
        student.testExample(10);
        student.printThrowException();
    }
}