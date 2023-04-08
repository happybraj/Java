package com.Demo;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i=0;
		for(i=1;i<=999;i++) {
			int ai=i/100;
			int bi=i%100/10;
			int ci=i%10;
			if(ai*ai*ai+bi*bi*bi+ci*ci*ci==i) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("~~~~~~~~~");
		int j=0;
		i=0;
		for(i=2;i<=100;i++) {
			j=2;
			while(i%j!=0) {
				j++;
			}
			if(i==j) {
				System.out.println(i);
			}
		}
		*/
		
		int i=0;
		int j=0;
		for(i=1;i<=9;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		int[] a = new int[100];
		int temp=0;
		for(i=0;i<100;i++) {
			temp+=2;
			a[i]+=temp;
			
		}
		
		int count=0;
		for(int x:a) {
			count++;
			if(count%10==0) {
				System.out.println();
			}
			System.out.print(x+"\t");
		}
		
		/*
		for(i=0;i<100;i++) {
			if(i%10==0) {
				System.out.println();
			}
			System.out.print(i+"\t");
		}
		 */
	}

}
