package com.eg;

import org.springframework.stereotype.Component;

@Component
public class A{
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
