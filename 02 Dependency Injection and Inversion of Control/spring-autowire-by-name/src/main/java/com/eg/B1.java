package com.eg;
public class B1 {
	C1 c;

	B1() {
		System.out.println("b constructor is invoked");
	}

	public void setC(C1 c) {
		System.out.println("setC() invoked");

		this.c = c;
	}

	void print() {
		System.out.println("hello b");
		//c.print();
	}
}