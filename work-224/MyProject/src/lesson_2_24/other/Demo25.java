package com.chapter02;

import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		//��ϰ: �ӿ���̨��ȡ��Ӧ����ֵ
		Scanner sc = new Scanner(System.in);
		System.out.println("������Int:");
		int a=sc.nextInt();			// int 
		System.out.println("a="+a);
		
		System.out.println("������byte:");
		byte b = sc.nextByte();		// byte
		System.out.println("b="+b);
		
		System.out.println("������short:");
		short c = sc.nextShort();		// short
		System.out.println("c="+c);
		
		System.out.println("������long:");
		long l = sc.nextLong();		// long
		System.out.println("l="+l);
		
		System.out.println("������boolean:");
		boolean bol = sc.nextBoolean();		// boolean
		System.out.println("bol="+bol);
		
		System.out.println("������float:");
		float f = sc.nextFloat();		// float
		System.out.println("f="+f);
		
		System.out.println("������double:");
		double d = sc.nextDouble();		// double
		System.out.println("d="+d);
		
		System.out.println("������char:");
		char ch = sc.next().charAt(0);		// char
		System.out.println("ch="+ch);
		
		System.out.println("������String:");
		String s = sc.next();		// String
		System.out.println("s="+s);
		
		

	}

}
