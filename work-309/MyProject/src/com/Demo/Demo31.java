package com.Demo;

public class Demo31 {

	public static void main(String[] args) {
		{
			//找到数组array中重复的元素；
			int[] array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
					
	        for(int i=0;i<array.length;i++) {
	        	int count=0;
	            for(int j =i+1;j<array.length;j++) {
	                if(array[i]==array[j]) {
	                    count++;
	                }
	            }
	            if(count==1)
	               System.out.println( "重复元素 : " + array[i] );
	            //count = 0;
	        }		
		}
		
		{
			int[] srcArray = { 101, 102, 103, 104, 105, 106 }; // 源数组
			int[] destArray = { 201, 202, 203, 204, 205};      // 目标数组
			System.arraycopy(srcArray, 2, destArray, 0, 4);    // 拷贝数组元素
			// 打印目标数组中的元素
			for (int i = 0; i < destArray.length; i++) {
				System.out.println(i + ": " + destArray[i]);
			}
		}
	}

}
