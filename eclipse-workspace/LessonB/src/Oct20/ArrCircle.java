package Oct20;


//내가 짠 코드 ! 선생님 코드는 LessonA에 있음

class Circle {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}

public class ArrCircle {
	public static void main(String[] args) {

		Circle[] cir = new Circle[5]; // int가 아니고 Circle이지. 위에 클래스 Circle해놓고 뭐함 ㅋㅋㅋ
		cir[0] = new Circle(5);
		cir[1] = new Circle(6);
		cir[2] = new Circle(7);
		cir[3] = new Circle(8);
		cir[4] = new Circle(9);

		int cnum = 0;
		for (int i = 0; i < cir.length; i++)
			cnum += cir[i].getArea(); // length가 아니고 getArea. 위에 getArea가 여기에 옴

		System.out.println("총 넓이 값: " + cnum);

	}
}
