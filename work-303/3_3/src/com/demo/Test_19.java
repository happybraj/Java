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
		System.out.println("�����ͣ�"+sum);
		
		i=1;
		sum=0;
		while(i<100) {
			sum+=i;
			i+=2;
		}
		System.out.println("�����ͣ�"+sum);
		System.out.println("~~~~~~~~~~~~");
		
		i=0;
		sum=0;
		while(i<=100) {
			sum+=i;
			i+=2;
		}
		System.out.println("ż���ͣ�"+sum);
		
		/*do whileִ������:
		 * 1.ִ�г�ʼ����ֵ
		 * 2.ִ��ѭ����
		 * 3.ִ�в������ʽ
		 * 4.�жϱȽϱ��ʽ
		 * 5.�ظ�ִ��2��3��4��ֱ��4�Ľ��Ϊ�٣�����ѭ��
		 */
		
		System.out.println("~~~~~~~~~~~~");
		i=0;
		sum=0;
		do {
			sum+=i;
			i+=5;
		}while(i<=100);
		
		System.out.println("һ��������ı�����"+sum);
		
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













































































































































































































































