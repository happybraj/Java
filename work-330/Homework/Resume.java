package com.lesson;

public class Resume {
	private String name;
	private String sex;
	private int age;
	
	public Resume() {
		
	}
	public Resume(String name,String sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void introduce() {
		System.out.println("姓名:"+this.name+"\n性别:"+this.sex+"\n年龄:"+this.age);
	}
	
}
