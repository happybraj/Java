package com.Demo;

public class Demo31 {

	public static void main(String[] args) {
		{
			//�ҵ�����array���ظ���Ԫ�أ�
			int[] array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
					
	        for(int i=0;i<array.length;i++) {
	        	int count=0;
	            for(int j =i+1;j<array.length;j++) {
	                if(array[i]==array[j]) {
	                    count++;
	                }
	            }
	            if(count==1)
	               System.out.println( "�ظ�Ԫ�� : " + array[i] );
	            //count = 0;
	        }		
		}
		
		{
			int[] srcArray = { 101, 102, 103, 104, 105, 106 }; // Դ����
			int[] destArray = { 201, 202, 203, 204, 205};      // Ŀ������
			System.arraycopy(srcArray, 2, destArray, 0, 4);    // ��������Ԫ��
			// ��ӡĿ�������е�Ԫ��
			for (int i = 0; i < destArray.length; i++) {
				System.out.println(i + ": " + destArray[i]);
			}
		}
	}

}
