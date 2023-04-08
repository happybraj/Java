package com.work406.newclass;
//当类为final class 不能有子类
public abstract class Animal {
	String name;
	int age;
	String color;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//被final修饰的方法final void,不能被重写
	public void eat() {
		System.out.println("吃饭");
	}
	public abstract void sleep();
}
