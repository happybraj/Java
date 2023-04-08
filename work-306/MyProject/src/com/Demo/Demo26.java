package com.Demo;
/*
* 主题：数组
   1.什么是数组。连续存储相同元素的集合
     一维数组
     多维数组
	 
   2.数组的定义格式
     动态初始化：
	数据类型[] 数组名 = new 数据类型[长度]；// 首选的方法
	数据类型 数组名[] = new 数据类型[长度]；// 效果相同 风格是来自 C/C++ 语言
      静态初始化
	数据类型[] 数组名 = new 数据类型{元素1，元素2，元素3....};
	数据类型[] 数组名 = {元素1，元素2，元素3....};

   3.数组元素的访问 数组的索引
	A:数组的索引从0开始编号
	B:数组元素的访问 ：数组名[索引]

   4.数组默认初始化值
	整数类型：0
	浮点类型：0.0
	字符类型：空白字符 '\u0000'
	布尔类型：false
	引用数据类型：null
	
   5.数组的主意事项
	A:直接输出数组名，默认打印的是数组的地址值
	B:数组的索引从0开始，最大取到长度-1 如果使用了不存在的索引，
		就会出现索引越界异常: ArrayIndexOutOfBoundsException
	C:如果数组没有任何引用了，还去操作就会出现空指针异常:NullPointerException	
*
*
*/
public class Demo26 {

	public static void main(String[] args) {

		int[] array = new int[100];
		int arrayList[] = new int[100]; 
		
		for(int i=0;i<array.length;i++) {
			array[i]=i+1;
			if(i!=0&&i%10==0) {
				System.out.println();
			}
			System.out.print(array[i]+"\t");
		}
		System.out.println("\n=======================");
		//加强版for循环
		for(int num:array) {
			System.out.print(num+"\t");
			if(num%10==0) {
				System.out.println();
			}
		}
						
	}

}
