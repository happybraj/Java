package com.Demo;

public class Test_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ji_Num());
		System.out.println(mul());
	}
	public static int ji_Num() {
		int sum=0;
		for(int i=1;i<=99;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static long mul() {
		long sum=1;
		int i=1;
//		for(i=1;i<=5;i++) {
//			sum*=i;
//		}
		do {
			sum*=i;
			i++;
		}while(i<=5);
		return sum;
	}

}
