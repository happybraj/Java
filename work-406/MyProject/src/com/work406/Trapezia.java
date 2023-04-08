package com.work406;

public class Trapezia extends Rectangle {
	private double u_buttom;
	private double l_buttom;
	private double l_lumbar;
	private double r_lumbar;
	
	public Trapezia() {super();}
	public Trapezia(double width,double height,double u_buttom,double l_buttom,double r_lumbar,double l_lumbar) {
		super(width,height);
		this.l_buttom = l_buttom;
		this.u_buttom = u_buttom;
		this.r_lumbar = r_lumbar;
		this.l_lumbar = l_lumbar;
	}
	
	public double getArea() {
		double Area = (u_buttom + l_buttom)*getHeight()/2; //getHeight()方法调用private成员变量
		return Area;
	}
	public double getGirth() {
		double Girth = u_buttom + l_buttom + r_lumbar + l_lumbar;
		return Girth;
	}
}
