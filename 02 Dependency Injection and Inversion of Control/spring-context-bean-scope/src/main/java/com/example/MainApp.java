package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

        Employee s=(Employee)beanFactory.getBean("e");
        s.setMarks(25);
        s.show();

		MyEmail email =(MyEmail)beanFactory.getBean("mail");
		email.sendMail();
		email.recvMail();

		MyEmail email2 =(MyEmail)beanFactory.getBean("mail");
		email.sendMail();
		email.recvMail();

	}
}
