package com.Demo;

/*	����:�߼������
	 & : �߼���(����)  ֻ������������δtrue,���������Ϊtrue
	 | : �߼���(����)  ֻ����һ������Ϊtrue,�����������true
	 ^ : �߼����	ֻҪ���߽����ͬ,�����������false,���߽����ͬ,�������true
	 ! : �߼���		�Ǽټ��� ���漴��
	 &&: ��·��	ִ�н����&��һ����,��������false,�ұ߾Ͳ���ִ����
	 ||: ��·��	ִ�н����|��һ����,��������true,�ұ߾Ͳ���ִ����
	 ע������: 
		 �߼�����������������߱����ǱȽϱ��ʽ
		 �߼���������յĽ��Ҳ�ǲ�������
*/
public class Demo13 {

	public static void main(String[] args) {
		
		//& :�߼���(����)
		System.out.println((5>3)&(5>4)); // t & t
		System.out.println((5>3)&(5<4)); // t & f
		System.out.println((5>6)&(5>8)); // f & f
		System.out.println((5>6)&(5<8)); // f & t
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// | :�߼���(����)
		System.out.println((5>3)|(5>4)); // t | t
		System.out.println((5>3)|(5<4)); // t | f
		System.out.println((5>6)|(5>8)); // f | f
		System.out.println((5>6)|(5<8)); // f | t
		System.out.println("||||||||||||||||||||||||||||||||");
		// ^ :�߼����
		System.out.println((5>3)^(5>4)); // t | t
		System.out.println((5>3)^(5<4)); // t | f
		System.out.println((5>6)^(5>8)); // f | f
		System.out.println((5>6)^(5<8)); // f | t
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		// ! :�߼���
		System.out.println(!true); 
		System.out.println(!false); 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//&&: ��·��
		int a=10,b=10;
		System.out.println((a++ == 10)&(++b > 10)); // t  &  t		
		System.out.println("a="+a+",b="+b);//a=11 b=11
		a=10;b=10;
		System.out.println((a++ > 10)&&(++b > 10)); //F && T
		System.out.println("a="+a+",b="+b);//

		System.out.println((++b > 10)||(a++ > 10)); //T && F
		System.out.println("a="+a+",b="+b);//		
		
	}

}
