package com.Demo;

import java.util.Scanner;

public class Test_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ӿ���̨��ȡ�༶���������༶��������ÿ����ļ۸����
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("������༶������");
		int allPeople=sc.nextInt();
		
		System.out.println("�������鱾�۸�");
		double value=sc.nextDouble();
		
		double sum = allPeople*value;
		System.out.println("�ܽ��Ϊ:"+sum);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ĳɼ�");
		
		int score=sc.nextInt();
		
//		if(score>100 || score<0) {
//			System.out.println("������");
//		}else if(score>=85) {
//			System.out.println("����");
//		}else if(score>=75 && score<80) {
//			System.out.println("����");
//		}else if(score>=60 && score<75) {
//			System.out.println("�ϸ�");
//		}else{
//			System.out.println("������");
//		}
		
		
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("����");
			case 8:
				if(score>=85) 
				{
					System.out.println("����");
					break;
				}
				System.out.println("����");
				break;
			case 7:
				if(score>=75) {
					System.out.println("����");
					break;
				}
				System.out.println("�ϸ�");
				break;
			case 6:
				System.out.println("�ϸ�");
				break;
			default:
				System.out.println("���ϸ�");
				break;
		}
		
		
		
		System.out.println("�������·�");
		int season = sc.nextInt();
		switch(season) {
		case 1:
		case 2:
		case 12:
			System.out.println("��");
			break;
		case 3:
		case 4:
		case 5:	
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("��");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("��");
			break;
	}
}

}
