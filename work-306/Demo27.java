package com.chapter02;
/**
 * @author x_iris
 * 主题:多维数组
 *  1.二维数组定义
 *    数据类型[][] 数组名 = new 数据类型[行][列]；
 * 	  数据类型 数组名[][] = new 数据类型[行][列]；
 *  
 *
 */
public class Demo27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = new int [2][];
		array[0] = new int[2];
		array[1] = new int[3];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=i+2;
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
