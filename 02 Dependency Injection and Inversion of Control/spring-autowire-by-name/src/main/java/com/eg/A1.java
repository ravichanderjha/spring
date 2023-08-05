package com.eg;
public class A1 {
	B1 b;//byName
	B1 by;

	A1() {
		System.out.println("a is created");
	}

	public B1 getB() {
		return b;
	}

	public void setB(B1 b) {
		System.out.println("setB() invoked");

		this.b = b;
	}

	void print() {
		System.out.println("hello a");
	}

	void display() {
		print();
		b.print();
		// c.print();
	}
}