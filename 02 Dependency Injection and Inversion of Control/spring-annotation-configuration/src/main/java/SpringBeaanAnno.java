
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		System.out.println("Employee() constructor");
	}
}

@Configuration
class MyConfig{
	@Bean
	public Employee getEBean(){
		return new Employee();
	}	
	
	@Bean
	public A getA(){
		return new A();
	}
}

public class SpringBeaanAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
		= new AnnotationConfigApplicationContext(MyConfig.class);

		//ctx.register(MyConfig.class);
		//ctx.refresh();
		
		Employee emp = ctx.getBean(Employee.class);
		emp.setName("mnop");
		
		System.out.println(emp.getName());
		
		A oa = ctx.getBean(A.class);
		System.out.println(oa);
		
		A oa1 = ctx.getBean(A.class);
	}
}
