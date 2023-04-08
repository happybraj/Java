package com.demo;
//Dog类实现Animal接口
public class Dog implements Animal{

	@Override
	public void ab_method() {
		// TODO Auto-generated method stub
		System.out.println("我是抽象方法");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃饭");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("狗呼吸");
	}
	
}
