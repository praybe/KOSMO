package edu.kosmo.ex.main;

import java.util.Scanner;

class Circle9{
	private double r;
	
	Circle9(double r){
		this.r = r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
	
	
}

public class ScanningCircle {
	public static void main(String[] args) {
				
		//Circle의 100을 Scanner로 받아보자
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력 하세요");		
		int radius = sc.nextInt();
		
		
		//객체 생성
		Circle9 c = new Circle9(radius);
		System.out.println(c.getArea());
				
		//System.out.println("반지름을 입력 하세요");
		//Scanner Circle = new Scanner(System.in);
		
		
		//int radius = Circle.nextInt(); 
		
		//System.out.println(radius*radius*Math.PI);
		//double area = Circle.nextDouble();
		
		//	String r = circle.next();
		//	System.out.println(r);
	
		
		//System.out.printf("%d * %d * %d = %d \n",radius, radius, area);
		

	}

}


