//메소드 연습
//원의 넓이

public class CircleArea2 {

	public static void main(String[] args) {

		double area = getCircleArea(10);

		System.out.println(area);

	}

	// 리턴타입 함수명
	public static double getCircleArea(double r) { // area가 아니라 r

		final double PI = 3.14; // 상수 만들어줘
		double area = r * r * PI;

		return area; // 이걸 안함.. 이걸 해야 위에 함수에 대한 문법 에러가 안뜸.

	}

}