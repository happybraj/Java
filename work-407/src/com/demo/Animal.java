package com.demo;
//�ӿڿɶ�̳�
public interface Animal extends LandAnimal,LandTest{
	
	//����
	public static final int ID = 1;
	//���󷽷�
	public abstract void breath();
	//Ĭ�Ϸ���
	public default void sleep() {System.out.println("˯��");};
	//��̬����
	public static int getId() {
		return ID;
	}
}
