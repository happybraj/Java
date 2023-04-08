package com.demo;
/**
 * 主题：接口
 * 
 * 1.什么是接口
 * 		接口是一种更加抽象的类。
 * 		接口的出现，打破了单继承的局限性。
 * 2.接口关键字
 * 		interface
 * 3.接口的定义
 * 		访问修饰符	 interface  接口名{
 * 			//常量
 * 			//抽象方法
 * 			//默认方法
 * 			//静态方法
 * 		}	
 * 4.注意事项
 * 		接口中不能有构造方法
 * 		接口不能直接创造对象使用
 * 5.接口和类的关系
 * 		实现关系:implements	而且可以多实现	
 * 6.接口和接口的关系
 * 		继承关系：extends 可以多继承
 * PS:类与类之间的关系
 * 		继承关系：extends 单继承
 *
 */
public class demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.ab_method();
		d.breath();
		d.eat();
	}

}
