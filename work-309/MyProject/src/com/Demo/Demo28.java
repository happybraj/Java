package com.Demo;

import java.util.Arrays;

/*
 * 主题：数组的操作
 *  1.数组的遍历
 *  2.获取数组最值
 *  3.数组排序
 *  
 */


public class Demo28 {

	public static void main(String[] args) {
		// 使用静态初始化创建数组
		int[] arr = {10,50,40,20,30};
		
		System.out.println(arr[0]);   // 10
		
		//数组的长度 数组名.length
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		//获取数组最大值
		//方法一：
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("\narr数组中的最大值为："+max);
		
		//方法二：
		Arrays.sort(arr);	//排序(升序)
		for(int num : arr) {
			System.out.print(num+"\t");
		}
		System.out.println("\narr数组中的最大值为："+arr[arr.length-1]);
	}

}
