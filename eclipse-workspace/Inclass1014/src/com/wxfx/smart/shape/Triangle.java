package com.wxfx.smart.shape;

public class Triangle{
	
	//실무에서 인스턴스 변수에 대해서는
	//무조건 기본적으로 private 선언해서 보호해야 한다.
	private int width;
	private int height;
	
	public void setWidth(int width){
		if(width <0) {
			width = 0;
			return;
		}
		this.width = width;
	}
	
	public int getArea() {
		return (width * height);
	}

	
	
}
