package com.work406.newclass;
//����Ϊfinal class ����������
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
	//��final���εķ���final void,���ܱ���д
	public void eat() {
		System.out.println("�Է�");
	}
	public abstract void sleep();
}
