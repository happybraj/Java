package com.Demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double score[][]= new double[3][5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<score.length;i++) {
			double sum=0;
			for(int j=0;j<score[i].length;j++) {
				
				if(j<3) {
					switch(j) {
						case 0:
							System.out.println("Input Chinese score:");
							break;
						case 1:
							System.out.println("Input Math score:");
							break;
						case 2:
							System.out.println("Input English score:");
							break;
						
					}
					
					score[i][j] = sc.nextDouble();
					sum += score[i][j];
				}
				
				if(j==3) score[i][j]=sum;
				if(j==4) score[i][j]=sum/3;
			}
		}
		
		System.out.println("语文\t数学\t英语\t总分\t平均分");
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		

		}
	}


