package org.example;

import java.io.IOException;

public class Student {
	private Integer age;
	private String name;

	public void setAge(Integer age) {
		System.out.println("setAge : " + age);
		this.age = age;
	}

	public Integer getAge() {
		System.out.println("getAgeeeeeeeeee : " + age);
		return age;
	}

	public void setName(String name, String str) {
		System.out.println("setName : " + name);
		this.name = name;
	}

	public String getName() {
		System.out.println("getNameeeeeeee : " + name);
		return name;
	}

	private void testExamplePvt(int i) {
		System.out.println("testExamplePvt:" + i);
	}

	public void testExample(int i) {
		System.out.println("testExample:" + i);
		testExamplePvt(10);
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}

	public void metEg() throws IOException {
		System.out.println("metEg() b4 throwing exception");
		throw new IOException();
	}
}