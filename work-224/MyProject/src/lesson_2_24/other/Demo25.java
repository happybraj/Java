package com.chapter02;

import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		//练习: 从控制台获取对应的数值
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入Int:");
		int a=sc.nextInt();			// int 
		System.out.println("a="+a);
		
		System.out.println("请输入byte:");
		byte b = sc.nextByte();		// byte
		System.out.println("b="+b);
		
		System.out.println("请输入short:");
		short c = sc.nextShort();		// short
		System.out.println("c="+c);
		
		System.out.println("请输入long:");
		long l = sc.nextLong();		// long
		System.out.println("l="+l);
		
		System.out.println("请输入boolean:");
		boolean bol = sc.nextBoolean();		// boolean
		System.out.println("bol="+bol);
		
		System.out.println("请输入float:");
		float f = sc.nextFloat();		// float
		System.out.println("f="+f);
		
		System.out.println("请输入double:");
		double d = sc.nextDouble();		// double
		System.out.println("d="+d);
		
		System.out.println("请输入char:");
		char ch = sc.next().charAt(0);		// char
		System.out.println("ch="+ch);
		
		System.out.println("请输入String:");
		String s = sc.next();		// String
		System.out.println("s="+s);
		
		

	}

}
