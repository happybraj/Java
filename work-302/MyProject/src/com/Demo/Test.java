package com.Demo;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入三条边的长度");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a+b>c && a-b<c) {
			if(a==b && b==c) {
				System.out.println("等边三角形");
			}else if(a==b && b!=c) {
				System.out.println("等腰三角形");
			}else {
				System.out.println("普通三角形");
			}			
		}else {
			System.out.println("不能构成三角形");
		}
		
		System.out.println("请输入年份: ");
		int year = sc.nextInt();
//		能被4整除，不能被100整除
		
		if(year%4==0 || year%400==0 && year%100!=0 ) {
			System.out.println("是闰年");
		}else {
			System.out.println("不是闰年");
		}
	}
}

















































































































































































































































































































































































































































