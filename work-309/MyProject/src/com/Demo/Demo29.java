package com.Demo;

public class Demo29 {

	public static void main(String[] args) {
		// ð������
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
	    //ѡ������
		{
			int [] array = {10,50,40,20,30};
			for(int i=0;i<array.length;i++) {
				int tem=i;
		        //�������д�i��ʼ����С��Ԫ������λ�õ�������ֵ��tem
				for(int j=i;j<array.length;j++) {
					if(array[j]<array[tem]) {
						tem=j;
					}
				}
				//�����ȡ�������д�i��ʼ����Сֵ��λ������Ϊtem�����ø���������iλ�ϵ�Ԫ��������н���
				int temp1=array[i];
				array[i]=array[tem];
				array[tem]=temp1;
			}
			System.out.println();
			for(int num : array) {
				System.out.print(num+"\t");
			}
		}
		
		//��������
		{

			int []array={10,50,40,20,30};
			for (int i = 1; i < array.length; i++) {
				for (int j = i; j > 0; j--){
					if(array[j - 1] > array[j]){	//��ķź���
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

		//��ת���� ��ԭ���鰴��������
		{
			//�������iλ�ϵ�Ԫ�����arr.length-i-1λ�ϵ�Ԫ�ؽ��н���
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
