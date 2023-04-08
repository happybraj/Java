package com.demo;
//接口可多继承
public interface Animal extends LandAnimal,LandTest{
	
	//常量
	public static final int ID = 1;
	//抽象方法
	public abstract void breath();
	//默认方法
	public default void sleep() {System.out.println("睡觉");};
	//静态方法
	public static int getId() {
		return ID;
	}
}
