package com.Demo;

class Animals{
	String name;//��Ա����
	String color;
	int age;
	
	public Animals(String name, String color, int age) {
		// TODO Auto-generated constructor stub
		super();//�޲�
		this.name = name;//�в�
		this.color = color;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void eat() {
		System.out.println("name="+this.name+"\n"+"color="+this.color+"\n"+"age="+this.age);
	}
}
