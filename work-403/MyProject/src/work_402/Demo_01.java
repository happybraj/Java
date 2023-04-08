package work_402;
/**
 * 
 * 主题：继承
 * 
 * 
 * 1.什么是继承?
 * 让类与类之间产生关系，子父类的关系;
 * 2.继承的关键字
 * 子类 extends 父类
 * 3.Java中的继承特点
 * 只支持单继承，但是可以多层继承
 * 4.继承父类只能使用父类的公共成员
 * 5.继承的优缺点
 * 优点: 
 * 		提高了代码的复用性
 * 	    提高了代码的维护性
 * 弊端:
 * 		类和类的耦合性太强(信息或参数依赖的程度)
 * 方法的重写:
 * 		方法的重写发生在子父类关系中
 * 		当父类提供的功能不能够满足子类具体的需求时，那么就需要对父类的方法进行重写
 * 		*方法头必须完全一样
 * 6.super关键字
 * 		可以访问父类成员(按住ctrl反编译)
 */
public class Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals an = new Animals("动物",4,"白色");
		System.out.println(an);
		an.eat();
		
		Cat cat = new Cat("橘猫",5,"橘色");
		System.out.println(cat);//使用toString方法 alt+shift+s
		cat.eat();
		
		Dog dog = new Dog("拉布拉多",5,"棕色");
		System.out.println(dog);
		dog.eat();
	}

}
