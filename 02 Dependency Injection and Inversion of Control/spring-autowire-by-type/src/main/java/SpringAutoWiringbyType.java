/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package springautowiringbytype;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  


/**
 *
 * @author ADMIN
 */
public class SpringAutoWiringbyType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context = 
             new ClassPathXmlApplicationContext("springconfig.xml");

      Employee te = (Employee) context.getBean("sEmployee");

      te.spellCheck();
    }
    
}
