package com.Demo;
/*
 * 主题：类的使用
 * 1.创建对象
 * 类名 对象名 = new 类名();
 * 
 * 2.使用成员
 * 使用成员变量：对象名.变量名;
 * 使用成员方法：对象名.方法名();
 * 
 * 3.成员变量的默认初始化值:
 * 整数类型：0
 * 浮点类型：0.0
 * 字符类型：''空白字符或'u0000'
 * 布尔类型：false
 * 引用数据类型：null
 * 
 * 4.局部变量和成员变量:
 * 访问特点：就近原则，谁高的近就优先使用谁
 * 区别：
 * A：定义位置
 * 		成员变量：定义在方法外
 * 		局部变量：定义在方法内部或者是方法声明上
 * B：内存中的位置
 * 		成员变量：堆内存
 * 		局部变量：栈内存
 * C：生命周期
 *      成员变量：随着对象的创建而创建，随着对象的消亡而消亡
 *      局部变量：随着方法的调用而创建，随着方法的消亡而消亡
 * D：默认初始化
 * 		成员变量：有默认初始化
 * 		局部变量：没有默认初始化，使用之前必须赋值
 * 
 * 5.堆内存形成的垃圾解决方案
 * 		如果一个对象没有任何引用指向它，那么它就变成了垃圾，由垃圾回收器机制进行回收
 * 6.构造方法
 * 		作用：创建对象(构造器)
 * 		构造方法的定义格式：
 * 		权限修饰符 方法名(同类名)(形参列表){
 * 			方法体;
 * 		}
 * 		1.方法名和类名要保持一致
 * 		2.构造方法没有返回值，连void也不能写
 * 		3.构造方法中不能写return语句，返回一个值
 * 		
 * 		注意事项：
 * 		1.如果我们没有写任何构造方法，系统会默认分配一个无参的空的构造方法;
 * 			但是如果我们一旦写了构造方法，系统默认分配的这个无参构造方法就没有了。
 * */
public class Test_object {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals ani = new Animals("狗","白色",3);
		ani.eat();
	}
}
