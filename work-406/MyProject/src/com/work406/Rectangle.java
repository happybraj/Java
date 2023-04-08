package com.work406;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {}
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea(double width,double height) {
		double Area = width * height;
		return Area;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
