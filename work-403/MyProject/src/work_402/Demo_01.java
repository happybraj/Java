package work_402;
/**
 * 
 * ���⣺�̳�
 * 
 * 
 * 1.ʲô�Ǽ̳�?
 * ��������֮�������ϵ���Ӹ���Ĺ�ϵ;
 * 2.�̳еĹؼ���
 * ���� extends ����
 * 3.Java�еļ̳��ص�
 * ֻ֧�ֵ��̳У����ǿ��Զ��̳�
 * 4.�̳и���ֻ��ʹ�ø���Ĺ�����Ա
 * 5.�̳е���ȱ��
 * �ŵ�: 
 * 		����˴���ĸ�����
 * 	    ����˴����ά����
 * �׶�:
 * 		�����������̫ǿ(��Ϣ����������ĳ̶�)
 * ��������д:
 * 		��������д�������Ӹ����ϵ��
 * 		�������ṩ�Ĺ��ܲ��ܹ�����������������ʱ����ô����Ҫ�Ը���ķ���������д
 * 		*����ͷ������ȫһ��
 * 6.super�ؼ���
 * 		���Է��ʸ����Ա(��סctrl������)
 */
public class Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals an = new Animals("����",4,"��ɫ");
		System.out.println(an);
		an.eat();
		
		Cat cat = new Cat("��è",5,"��ɫ");
		System.out.println(cat);//ʹ��toString���� alt+shift+s
		cat.eat();
		
		Dog dog = new Dog("��������",5,"��ɫ");
		System.out.println(dog);
		dog.eat();
	}

}
