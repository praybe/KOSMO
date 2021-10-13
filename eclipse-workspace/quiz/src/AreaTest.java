class Circle {

	double r;
	
	double getR() { // r을 꺼내는 함수
		return r;
	}

	void setR(double rad) { // 원래있던 값에 세팅만 혀
		r = rad;
	}

	double getArea() {
		return r * r * Math.PI;
	}
}


class Rectangle{
	
	int width; //int 가로; 가능
	int height; //int 세로;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return height * width;
	}
	

	
}

public class AreaTest {
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.setHeight(10); // rec안에 가로 10 세로 10인 사각형이 저장되는 함수가 됨
		rec.setWidth(10); //set함수가 안에 있는 인스턴스 값을 집어 넣는 것
		System.out.println(rec.getArea());
		
		rec.setHeight(20);
		rec.setWidth(20);
		System.out.println(rec.getArea());

		
		
		
		Circle circle = new Circle();

		circle.setR(10);
		double area = circle.getArea();
		System.out.println(area);

		circle.setR(20);
		System.out.println(circle.getArea());

	}

}
