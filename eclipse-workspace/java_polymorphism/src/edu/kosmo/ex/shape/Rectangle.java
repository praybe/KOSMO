package edu.kosmo.ex.shape;

public class Rectangle extends Shape {

	private int width, height;
	
	public Rectangle (int width, int height) {
		this.height = height;
		this.width = width;
	}

	//반드시 double로하고 함수이름 getArea()로 맞춰줘
	//Circle class랑 함수오버라이딩 시킬거라서 
	public double getArea() {
		return width * height;
	}

}
