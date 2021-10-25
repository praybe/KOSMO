package edu.kosmo.ex.shape;

public class Triangle extends Shape {

	private int w, h;
	
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public double getArea() {
		return w * h * 0.5;
	}

}
