package com.beforelesson;
/*
 * ���⣺����
 *     ����:
 *     	  �޷���ֵ�޲��� 1
 *     	  �޷���ֵ�в��� 1
 *        �з���ֵ�޲��� 1
 *        �з���ֵ�в��� 1
 *     �����ĵ��ã�
 * 		  ������(ʵ��);
 *     ����������:
 *        ͬһ�������������ͬ�����ò����ĸ��������͡�˳��Ĳ�ͬ��ʵ�ַ���������
 */
public class Test_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr = {1,2,3,4,5};
		
		int[] array;
		array = new int[100];
		
		int[][] twoarr = {{1,2,3,4,5}};
		
		int[][] twoarrarr;
		twoarrarr = new int[5][5];
		*/
		
		//��̬������ֻ�ܵ��þ�̬��������static
		print();
		print("�в����޷���ֵ");
		add();
		System.out.println(add(1,1));
		
		Test_19 a = new Test_19();
		a.test();
		
		System.out.println("26+26="+cal(26.0,26.0)); //+
		System.out.println("4-3="+cal(+4.0,3.0)); //-
		System.out.println("1.2*1.2="+cal(1.2,1.2)); //*
		System.out.println("10/2="+cal(10.0,2.0)); //��
		System.out.println("������:"+jinum(1,100));
		
		//float���� ���κ���+f
		//1f
 	}
	//-----------------------------------------------------------------------//
	public static void print() {
		System.out.println("�޲����޷���ֵ");
	}
	public static void print(String str) {
		System.out.println(str);
	}
	public static int add() {
		//�з���ֵ�޲���
		return 1+1;
	}
	public static int add(int a,int b) {
		//�з���ֵ�в���
		return a+b;
	}
	public  void test() {
		System.out.println("�Ǿ�̬�ھ�̬�����е���");
		System.out.println("-----------------------------------");
	}
	//-----------------------------------------------------------------------//
	
	public static double cal(double a,double b) {
		//�������ؼӼ��˳�
		return a+b;
	}
	public static double cal(double a,int b) {
		//�������ؼӼ��˳�
		return a-b;
	}
	public static double cal(int a,double b) {
		//�������ؼӼ��˳�
		return a*b;
	}
	public static double cal(float a,double b) {
		//�������ؼӼ��˳�
		return a/b;
	}
	
	public static int jinum(int a,int b) {
		int sum=0;
		for(int i=a;i<b;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
	
}
