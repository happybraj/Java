package com.Demo;

public class Demo29 {

	public static void main(String[] args) {
		// 冒泡排序
		{
			int i, j, k;
			int [] array = {10,50,40,20,30};
		    for(i=0; i<array.length-1; i++) {
		        for(j=0; j<array.length-1-i; j++)
		        {
		            if(array[j]>array[j+1])
		            {
		                k=array[j];
		                array[j]=array[j+1];
		                array[j+1]=k;
		            }
		        }
		    }
		    
			for(int num : array) {
				System.out.print(num+"\t");
			}
		}
	    //选择排序
		{
			int [] array = {10,50,40,20,30};
			for(int i=0;i<array.length;i++) {
				int tem=i;
		        //将数组中从i开始的最小的元素所在位置的索引赋值给tem
				for(int j=i;j<array.length;j++) {
					if(array[j]<array[tem]) {
						tem=j;
					}
				}
				//上面获取了数组中从i开始的最小值的位置索引为tem，利用该索引将第i位上的元素与其进行交换
				int temp1=array[i];
				array[i]=array[tem];
				array[tem]=temp1;
			}
			System.out.println();
			for(int num : array) {
				System.out.print(num+"\t");
			}
		}
		
		//插入排序
		{

			int []array={10,50,40,20,30};
			for (int i = 1; i < array.length; i++) {
				for (int j = i; j > 0; j--){
					if(array[j - 1] > array[j]){	//大的放后面
						int tmp = array[j - 1];
						array[j - 1] = array[j];
						array[j] = tmp;
					}
				}
			}
			System.out.println();
			for(int num : array) {
				System.out.print(num+"\t");
			}			
		}

		//反转排序 将原数组按逆序排列
		{
			//将数组第i位上的元素与第arr.length-i-1位上的元素进行交换
			int []array={10,50,40,20,30};
			for(int i=0;i<array.length/2;i++) {
				int tp=array[i];
				array[i]=array[array.length-i-1];
				array[array.length-i-1]=tp;
			}
			System.out.println();
			for(int num : array) {
				System.out.print(num+"\t");
			}
		}
	
	}

}
