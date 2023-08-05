package com.eg;

import org.springframework.stereotype.Component;

@Component
public class Employee{
	private String name;
	private A oa;

	public Employee(A oa) {
		this.oa = oa;
	}
	
	public Employee() {

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
