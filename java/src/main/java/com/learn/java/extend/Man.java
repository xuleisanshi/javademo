package com.learn.java.extend;

public class Man extends Person {
	public Man() {
		super("xu");
	}
	// @Override
	public void eat(String food) {
		System.out.println("Man will eat" + food);
	}

	protected void sayName() {
		System.out.println("what is your lei "+ name );
	}
}
