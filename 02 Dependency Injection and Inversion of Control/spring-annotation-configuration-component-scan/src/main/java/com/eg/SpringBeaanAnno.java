package com.eg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = {"com.eg",})
public class SpringBeaanAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBeaanAnno.class);

		//ctx.register(MyConfig.class);
		//ctx.refresh();
		
		Employee emp = ctx.getBean(Employee.class);
		emp.setName("pqrst");
		
		System.out.println(emp.getName());
		
		A oa = ctx.getBean(A.class);
		System.out.println(oa);
		
		A oa1 = ctx.getBean(A.class);
	}
}
