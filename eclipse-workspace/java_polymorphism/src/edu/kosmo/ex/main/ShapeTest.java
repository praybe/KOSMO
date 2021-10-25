package edu.kosmo.ex.main;

import edu.kosmo.ex.shape.Circle;
import edu.kosmo.ex.shape.Rectangle;
import edu.kosmo.ex.shape.Shape;
import edu.kosmo.ex.shape.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		
		Shape[] shape = {new Circle(10), new Rectangle(10, 10), new Triangle(10, 10)};
		
		double sum =0;
		for(Shape shape2 : shape) {
			sum = sum + shape2.getArea();
		}
		System.out.println(sum);

		Circle circle = new Circle(10);
		Rectangle rec = new Rectangle(10, 10);

		double totalArea = circle.getArea();
		totalArea = rec.getArea();

		System.out.println(totalArea);

	}

}
