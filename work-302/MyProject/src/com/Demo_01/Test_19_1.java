package com.Demo_01;
import java.util.Scanner;
public class Test_19_1 {

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
		
		
		//---------------------------------------------//
		
		System.out.println("请输入工资");
		double money = sc.nextDouble();
		System.out.println("请输入加班补贴");
		double bonus = sc.nextDouble();
		
		double sum = money+bonus-3000;
		double finnalSum = 0;
		if(sum<=3000) {
			finnalSum = sum - (sum*0.03);
		}else if(sum>3000 && sum<=12000) {
			finnalSum = sum - (sum-3000)*0.1-(3000*0.03);
		}else if(sum>12000 && sum<=25000) {
			finnalSum = sum - (sum-12000)*0.2-(3000*0.03)-(9000*0.1);
		}else if(sum>25000 && sum<=35000) {
			finnalSum = sum - (sum-25000)*0.2-(3000*0.03)-(9000*0.1)-(13000*0.2);
		}else if(sum>35000 && sum<=55000) {
			finnalSum = sum - (sum-35000)*0.3-(3000*0.03)-(9000*0.1)-(13000*0.2)-(10000*0.25);
		}else if(sum>55000 && sum<=80000){
			finnalSum = sum - (sum-55000)*0.35-(3000*0.03)-(9000*0.1)-(13000*0.2)-(10000*0.25)-(20000*0.3);
		}else {
			finnalSum = sum - sum*0.4-(3000*0.03)-(9000*0.1)-(13000*0.2)-(10000*0.25)-(20000*0.3)-(25000*0.35);
		}
		finnalSum = finnalSum+3000;
		System.out.println("您的税后工资为:"+finnalSum);
		
	}
}

















































































































































































































































































































































































































































