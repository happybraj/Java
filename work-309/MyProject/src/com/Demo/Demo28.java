package com.Demo;

import java.util.Arrays;

/*
 * ���⣺����Ĳ���
 *  1.����ı���
 *  2.��ȡ������ֵ
 *  3.��������
 *  
 */


public class Demo28 {

	public static void main(String[] args) {
		// ʹ�þ�̬��ʼ����������
		int[] arr = {10,50,40,20,30};
		
		System.out.println(arr[0]);   // 10
		
		//����ĳ��� ������.length
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		//��ȡ�������ֵ
		//����һ��
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("\narr�����е����ֵΪ��"+max);
		
		//��������
		Arrays.sort(arr);	//����(����)
		for(int num : arr) {
			System.out.print(num+"\t");
		}
		System.out.println("\narr�����е����ֵΪ��"+arr[arr.length-1]);
	}

}
