package com.Demo;

import java.util.Scanner;

public class Test_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//从控制台获取班级总人数，班级人数乘以每本书的价格输出
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int allPeople=sc.nextInt();
		
		System.out.println("请输入书本价格");
		double value=sc.nextDouble();
		
		double sum = allPeople*value;
		System.out.println("总金额为:"+sum);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的成绩");
		
		int score=sc.nextInt();
		
//		if(score>100 || score<0) {
//			System.out.println("不存在");
//		}else if(score>=85) {
//			System.out.println("优秀");
//		}else if(score>=75 && score<80) {
//			System.out.println("良好");
//		}else if(score>=60 && score<75) {
//			System.out.println("合格");
//		}else{
//			System.out.println("不及格");
//		}
		
		
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("优秀");
			case 8:
				if(score>=85) 
				{
					System.out.println("优秀");
					break;
				}
				System.out.println("良好");
				break;
			case 7:
				if(score>=75) {
					System.out.println("良好");
					break;
				}
				System.out.println("合格");
				break;
			case 6:
				System.out.println("合格");
				break;
			default:
				System.out.println("不合格");
				break;
		}
		
		
		
		System.out.println("请输入月份");
		int season = sc.nextInt();
		switch(season) {
		case 1:
		case 2:
		case 12:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:	
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("秋");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("夏");
			break;
	}
}

}
