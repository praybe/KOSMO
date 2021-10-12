
class Circle {

	int radius;

	public void setRadius(int r) {
		radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}

public class Num06 {
	public static void main(String[] args) {

		Circle circle = new Circle();

		circle.setRadius(6);

		int radius = circle.getRadius();
		double area = circle.getArea();

		System.out.println(radius);
		System.out.println(area);

	}
}

/*
 * 나의 실수: public class설정 안하고 void main에서 main을 안적고 다른 변수를 넣음 new안 쓰고 circle만 적음
 */