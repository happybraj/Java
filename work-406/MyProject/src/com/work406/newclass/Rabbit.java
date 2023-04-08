package com.work406.newclass;

public abstract class Rabbit extends Animal {

	public Rabbit() {
		super();
	}

	public Rabbit(String name, int age, String color) {
		super(name, age, color);
	}
	
	@Override
	public void sleep() {
		System.out.println();
	}
}
