package Oct26;

interface AreaGetable {
	double getArea();
}

class Circle2 implements AreaGetable {

	int r;

	public Circle2(int r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;

	}

}

class Rectangle2 implements AreaGetable {
	int width, height;

	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;

	}

}

class Triangle2 implements AreaGetable {
	int width, height;

	public Triangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height * 0.5;

	}

}

public class ShapeInterface {
	public static void main(String[] args) {
		AreaGetable area = new Circle2(4);
		System.out.println(area.getArea());

		area = new Rectangle2(4, 5);
		System.out.println(area.getArea());

		area = new Triangle2(4, 5);
		System.out.println(area.getArea());

	}
}
