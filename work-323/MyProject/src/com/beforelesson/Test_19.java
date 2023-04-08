package com.beforelesson;
/*
 * 主题：方法
 *     分类:
 *     	  无返回值无参数 1
 *     	  无返回值有参数 1
 *        有返回值无参数 1
 *        有返回值有参数 1
 *     方法的调用：
 * 		  方法名(实参);
 *     方法的重载:
 *        同一个类里，方法名相同，利用参数的个数、类型、顺序的不同，实现方法的重载
 */
public class Test_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr = {1,2,3,4,5};
		
		int[] array;
		array = new int[100];
		
		int[][] twoarr = {{1,2,3,4,5}};
		
		int[][] twoarrarr;
		twoarrarr = new int[5][5];
		*/
		
		//静态方法中只能调用静态方法，即static
		print();
		print("有参数无返回值");
		add();
		System.out.println(add(1,1));
		
		Test_19 a = new Test_19();
		a.test();
		
		System.out.println("26+26="+cal(26.0,26.0)); //+
		System.out.println("4-3="+cal(+4.0,3.0)); //-
		System.out.println("1.2*1.2="+cal(1.2,1.2)); //*
		System.out.println("10/2="+cal(10.0,2.0)); //除
		System.out.println("奇数合:"+jinum(1,100));
		
		//float类型 传参后面+f
		//1f
 	}
	//-----------------------------------------------------------------------//
	public static void print() {
		System.out.println("无参数无返回值");
	}
	public static void print(String str) {
		System.out.println(str);
	}
	public static int add() {
		//有返回值无参数
		return 1+1;
	}
	public static int add(int a,int b) {
		//有返回值有参数
		return a+b;
	}
	public  void test() {
		System.out.println("非静态在静态方法中调用");
		System.out.println("-----------------------------------");
	}
	//-----------------------------------------------------------------------//
	
	public static double cal(double a,double b) {
		//方法重载加减乘除
		return a+b;
	}
	public static double cal(double a,int b) {
		//方法重载加减乘除
		return a-b;
	}
	public static double cal(int a,double b) {
		//方法重载加减乘除
		return a*b;
	}
	public static double cal(float a,double b) {
		//方法重载加减乘除
		return a/b;
	}
	
	public static int jinum(int a,int b) {
		int sum=0;
		for(int i=a;i<b;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
	
}
