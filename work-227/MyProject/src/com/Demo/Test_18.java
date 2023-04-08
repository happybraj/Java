package com.Demo;


import java.util.Scanner;


public class Test_18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int people=0;
		double price=0;
		
		System.out.println("请输入班级人数");
		people=sc.nextInt();
		System.out.println("请输入单价");
		price=sc.nextDouble();
		
		System.out.println("总价为："+people*price);
		
		
	}
}
