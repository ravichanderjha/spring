package com.ab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DummyEmail implements IEmail{
	MnoEmail obj;
	DummyEmail()
	{
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        obj=(MnoEmail)factory.getBean("mail"); 
        
        MnoEmail obj1=(MnoEmail)factory.getBean("mail"); 
	}
	public void sendMail()
	{
		obj.sendMail();
	}
	
	public void recvMail()
	{
		obj.recvMail();
	}
}
