package com.javaex.ex04;

public class RectTriangle extends Shape {
	// 필드
	private double width;
	private double height;

	// 생성자
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() { // 직각 삼각형 넓이
		return (width * height) / 2;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width * width + height * height);
	}

}