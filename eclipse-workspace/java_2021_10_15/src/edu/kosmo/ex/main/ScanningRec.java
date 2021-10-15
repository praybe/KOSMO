package edu.kosmo.ex.main;

import java.util.Scanner;

class Rectangle9{
	private int width, height;
	
	Rectangle9(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	
}

public class ScanningRec {
	public static void main(String[] args) {
				
		//Scanner로 받아보자
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 세로 입력 하세요");		
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		
		//객체 생성
		Rectangle9 rec = new Rectangle9(width, height);
		System.out.println("넓이는 " + rec.getArea() + " 입니다");
				
	}

}


