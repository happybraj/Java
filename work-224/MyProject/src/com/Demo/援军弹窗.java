package com.Demo;
import javax.swing.*;

public class 援军弹窗 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//同一作用域变量不能重名
		String name = "我是援军";
		int a = 1;
		while(a==1) {
			String s = JOptionPane.showInputDialog("请输入我是援军");
			int r = s.compareTo(name);
			if(r==0)
				a=0;
			else
				System.out.println("援军！");
		}
		JOptionPane.showMessageDialog(null,"666");
	}

}
