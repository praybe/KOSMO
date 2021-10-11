//메소드 연습
//직사각형 넓이

public class RectArea {

	public static void main(String[] args) {

		double width = 100;
		double height = 100;

		double area = getRectArea(width, height);

		System.out.println(area);

	}

	public static double getRectArea(double w, double h) { // 변수선언은 맘대로 해도 됨. 타입은 double로 반드시 맞춰줘야함

		return w * h;

	}

}