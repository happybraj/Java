package com.lesson1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle re = new Rectangle(4,4); 
		Trapezia tr =  new Trapezia(4,4,4,4,4,4);
		System.out.println(tr);
		System.out.println(re.getArea(4,4));//长方形面积
		System.out.println(tr.getArea());//梯形面积
		System.out.println(tr.getGirth());//梯形周长
	}

}
