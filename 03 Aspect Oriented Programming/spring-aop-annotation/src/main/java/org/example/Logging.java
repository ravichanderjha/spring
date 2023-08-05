package org.example;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	/* To apply same pointcut to multiple Advices,
	 we can create a place holder such as below, and reuse it */
	@Pointcut("execution(* *.set*(..))")
	public void setterPtCut() {

	}

	/* In Place of pointcut expression place holder name can be specified */
	@Before("setterPtCut()")
	public void beforeSetterAdvice() {
		System.out.println("Logging before calling a setter Method.....");
	}

	@After("setterPtCut()")
	public void AfterSetterAdvice() {
		System.out.println("Logging After calling a setter Method.....");
	}

	@Pointcut("execution(* *.get*(..))")
	public void getterPtCut() {

	}

	@Before("getterPtCut()")
	public void beforeGetterAdvice() {
		System.out.println("Logging Before Getter Method......");
	}

	@AfterReturning("getterPtCut()")
	public void AfterReturnGetterAdvice() {
		System.out.println("Logging After Returning Getter Method.....");
	}

	@After("getterPtCut()")
	public void AfterGetterAdvice() {
		System.out.println("Logging After Getter Method......");
	}
	/*
	After type advice will be invoked and executed fully.

	AfterReturning type advice will be invoked and executed fully 
	if jointpoint executes successfully 
	
	else if jointpoint throws any error then AfterThrowing type 
	advice will be invoked and executed fully.
	 */
}
