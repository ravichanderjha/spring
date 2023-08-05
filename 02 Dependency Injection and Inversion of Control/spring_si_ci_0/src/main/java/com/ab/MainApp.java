package com.ab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

        //We are providing the values 10 and "abcd" dynamically
        //Employee s=(Employee)factory.getBean("e",38,"testingpurpose");
        Employee s=(Employee)factory.getBean("e",32,"jhsdfgj");
        s.setMarks(25);
        s.show();



		DummyEmail dobj = new DummyEmail();
		dobj.recvMail();
		dobj.sendMail();


	}
}
