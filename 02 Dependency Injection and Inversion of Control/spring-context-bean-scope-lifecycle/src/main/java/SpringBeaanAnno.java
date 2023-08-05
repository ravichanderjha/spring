import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

class A{
	A(){
		System.out.println("A()");
	}
	
	public void initBn(){
		System.out.println("initBn()...");
	}
	
	public void destroyBn(){
		System.out.println("destroyBn()...");
	}
}

class Employee{
	private String name;
	private A oa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(A oa) {
		this.oa = oa;
	}
}

@Configuration
class MyConfig{
	@Bean
	public Employee getEBean(){
		return new Employee(getA());
	}	
	
	@Bean(initMethod= "initBn", destroyMethod="destroyBn")
	@Scope("singleton")
	public A getA(){
		return new A();
	}
}

public class SpringBeaanAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

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
