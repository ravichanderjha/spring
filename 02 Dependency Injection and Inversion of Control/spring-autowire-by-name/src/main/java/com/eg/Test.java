package com.eg;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
    A1 obj=context.getBean("a",A1.class);  
    obj.display();  
}  
}