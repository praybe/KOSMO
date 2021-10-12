//객체생성
//우리가 class를 만들 수 있는 것 

class Circle {
	// 인스턴스 변수 선언
	int radius; // 함수 밖, 클래스 안에 변수 선언 함

	public void setRadius(int r) {
		radius = r; // raidus에 값을 집어 넣고
	}

	public int getRadius() {
		return radius; // radius값을 내겠다. 클래스 안에 있는 반지름 값을 가져오겠다.
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}

public class InstanceTest {

	public static void main(String[] args) {

		Circle circle = new Circle();

		circle.setRadius(5);

		int radius = circle.getRadius(); // 뒤에 ()함수 표시 있으니까 함수 호출

		System.out.println(radius);
		System.out.println(circle.getRadius());

		double area = circle.getArea();

		System.out.println(area);

	}

}
