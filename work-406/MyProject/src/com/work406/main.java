package com.work406;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle re = new Rectangle(4,4); 
		Trapezia tr =  new Trapezia(4,4,4,4,4,4);
		System.out.println(tr);
		System.out.println(re.getArea(4,4));//闀挎柟褰㈤潰绉�
		System.out.println(tr.getArea());//姊舰闈㈢Н
		System.out.println(tr.getGirth());//姊舰鍛ㄩ暱
	}

}
