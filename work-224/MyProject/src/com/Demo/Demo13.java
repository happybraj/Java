package com.Demo;

/*	主题:逻辑运算符
	 & : 逻辑与(并且)  只有所有条件都未true,整个结果才为true
	 | : 逻辑或(或者)  只有有一个条件为true,整个结果都是true
	 ^ : 逻辑异或	只要两边结果相同,整个结果都是false,两边结果不同,整个结果true
	 ! : 逻辑非		非假即真 非真即假
	 &&: 短路与	执行结果和&是一样的,如果左边是false,右边就不再执行了
	 ||: 短路或	执行结果和|是一样的,如果左边是true,右边就不再执行了
	 注意事项: 
		 逻辑运算符它的左右两边必须是比较表达式
		 逻辑运算符最终的结果也是布尔类型
*/
public class Demo13 {

	public static void main(String[] args) {
		
		//& :逻辑与(并且)
		System.out.println((5>3)&(5>4)); // t & t
		System.out.println((5>3)&(5<4)); // t & f
		System.out.println((5>6)&(5>8)); // f & f
		System.out.println((5>6)&(5<8)); // f & t
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// | :逻辑或(或者)
		System.out.println((5>3)|(5>4)); // t | t
		System.out.println((5>3)|(5<4)); // t | f
		System.out.println((5>6)|(5>8)); // f | f
		System.out.println((5>6)|(5<8)); // f | t
		System.out.println("||||||||||||||||||||||||||||||||");
		// ^ :逻辑异或
		System.out.println((5>3)^(5>4)); // t | t
		System.out.println((5>3)^(5<4)); // t | f
		System.out.println((5>6)^(5>8)); // f | f
		System.out.println((5>6)^(5<8)); // f | t
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		// ! :逻辑非
		System.out.println(!true); 
		System.out.println(!false); 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//&&: 短路与
		int a=10,b=10;
		System.out.println((a++ == 10)&(++b > 10)); // t  &  t		
		System.out.println("a="+a+",b="+b);//a=11 b=11
		a=10;b=10;
		System.out.println((a++ > 10)&&(++b > 10)); //F && T
		System.out.println("a="+a+",b="+b);//

		System.out.println((++b > 10)||(a++ > 10)); //T && F
		System.out.println("a="+a+",b="+b);//		
		
	}

}
