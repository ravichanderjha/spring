import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
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
	//@Lazy(value = false)
	//@Scope("prototype")
	public Employee getEBean(){
		return new Employee();
	}	
	
	@Bean
	public A getA(){
		return new A();
	}
}

public class SpringBeaanAnno1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(MyConfig.class);
		ctx.refresh();
		
/*		
		//Comment all below functionality, then Employee bean will not be created as its Lazy
		 
		Employee emp = ctx.getBean(Employee.class);
		emp.setName("fevbrgver");
		
		System.out.println(emp.getName());
		
		A oa = ctx.getBean(A.class);
		System.out.println(oa);
*/
	}
}
