package com.demo;

public class Test_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,j=0;
		
		int sum=0;
		while(i<=100) {
			if(i%2!=0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("奇数和："+sum);
		
		i=1;
		sum=0;
		while(i<100) {
			sum+=i;
			i+=2;
		}
		System.out.println("奇数和："+sum);
		System.out.println("~~~~~~~~~~~~");
		
		i=0;
		sum=0;
		while(i<=100) {
			sum+=i;
			i+=2;
		}
		System.out.println("偶数和："+sum);
		
		/*do while执行流程:
		 * 1.执行初始化赋值
		 * 2.执行循环体
		 * 3.执行步长表达式
		 * 4.判断比较表达式
		 * 5.重复执行2、3、4，直到4的结果为假，结束循环
		 */
		
		System.out.println("~~~~~~~~~~~~");
		i=0;
		sum=0;
		do {
			sum+=i;
			i+=5;
		}while(i<=100);
		
		System.out.println("一百以内五的倍数："+sum);
		
		i=0;
		for(i=0;i<=100;i++) {
			System.out.print(i+"	");
			if(i%10==0) {
				System.out.println();
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		i=0;
		j=0;
		for(i=1;i<=9;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"	");
			}
			System.out.println();
		}
	}
}













































































































































































































































