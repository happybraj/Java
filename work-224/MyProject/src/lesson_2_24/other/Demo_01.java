package lesson_2_24;
import javax.swing.*;

public class Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͬһ�����������������
		String name = "����Ԯ��";
		int a = 1;
		while(a==1) {
			String s = JOptionPane.showInputDialog("����������Ԯ��");
			int r = s.compareTo(name);
			if(r==0)
				a=0;
			else
				System.out.println("Ԯ����");
		}
		JOptionPane.showMessageDialog(null,"666");
	}

}
