package com.mindgate.pojo;

public class B extends A {
	public B() {

		System.out.println("hello");
	}
	public B(int x) {
		super(x);

		System.out.println("hello"+x);
	}


}
