package com.Demo;
/*
 * ����:��ת���(���̿������)
 *  break:
 *  	ʹ�ó���:��������switch����ѭ�������
 *  	����:ֹͣswitch����ѭ�����
 *  continue:
 *  	ʹ�ó���:ֻ������ѭ�������
 *  	����:��������ѭ��,������һ��ѭ��;
 */
public class Demo24 {

	public static void main(String[] args) {
		// ����:�ۼ�1-100,���������200ʱ,����ѭ��
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(sum>=200){
				System.out.println(sum);
				break;
			}
		}
		sum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum+"\n");
		//���ñ�ǩ����Ƕ��ѭ�������ѭ��
		i:for(int i=1;i<=3;i++){
			j:for(int j=1;j<=5;j++) {
				if(j==3) {
					break i;
				}
				System.out.println(j);
			}
		}
		//continue:
		for(int i=1;i<=5;i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
