package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class Logging {

	@Before("execution(* *.*(..))")
	public void bAdvice(JoinPoint jp) {
		System.out.println("bbbbbbbefore Advice invoked::" + jp.getSignature().getName() + "\t"
				+ jp.getTarget().getClass().getName());
		/*
		 Object params[] = jp.getArgs(); String str =(String)params[0];
		 System.out.println("Paramssssssssss:"+str);
		 */
	}

	@AfterReturning(pointcut = "execution(* *.*(..))", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		if (retVal != null) {
			System.out.println("Returninggggggggggggggg:" + retVal.toString());
		}
	}

	@Before("execution(* *.get*(..))")
	public void aAdvice() {
		System.out.println("\nBefore adv--------------beforeeeeeeeeeeeeeeeeeeeee------------\n");
	}

	@After("execution(* *.get*(..))")
	public void myOwnAdvice() {
		System.out.println("\nAfter adv--------------afterrrrrrrrrrrrrrrrrr------------\n");
	}

	@AfterThrowing(value= "execution(* *.*(..))", throwing= "exception")
	public void afterThrowingAdv(JoinPoint jp, Throwable exception) {
		System.out.println("Inside afterThrowingAdv() advice= " + jp.getSignature().getName() + " method");
		System.out.println("Exception = " + exception);
	}
	
	@Around("execution(* *.*(..))") public void adAdvice(){
		System.out.println("Around Advice called\n"); 
	}


}