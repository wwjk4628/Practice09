package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable{
	private double width;
	private double height;

	public Rectangle(double width, double heigth) {
		this.height = heigth;
		this.width = width;
	}

	@Override
	public double getArea() {

		return width * height;
	}

	@Override
	public double getPerimeter() {

		return (height + width) * 2;
	}
	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
		
	}
	
}