package Oct29;

class Point3 implements Cloneable {
	private int xPos;
	private int yPos;

	public Point3(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Rectangle implements Cloneable {
	private Point3 upperLeft; // 좌측 상단 좌표
	private Point3 lowerRight; // 우측 하단 좌표

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point3(x1, y1);
		lowerRight = new Point3(x2, y2);
	}

	// 좌표 정보 수정
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// Object 클래스의 clone 메소드 호출 결과를 얻음
		Rectangle copy = (Rectangle) super.clone();

		// 깊은 복사의 형태로 복사본을 수정
		copy.upperLeft = (Point3) upperLeft.clone();
		copy.lowerRight = (Point3) lowerRight.clone();

		// 완성된 복사본의 참조를 반환
		return copy;

	}

	// 직사각형 좌표 정보 출력
	public void showPosition() {
		System.out.println("좌측 상단: ");
		upperLeft.showPosition();

		System.out.println("우측 상단: ");
		lowerRight.showPosition();
		System.out.println();
	}

}

 class DeepCopy {
	public static void main(String[] args) {

		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;

		try {
			// 인스턴스 복사
			cpy = (Rectangle) org.clone();

			// 한 인스턴스의 좌표정보 수정
			org.changePos(2, 2, 7, 7);
			org.showPosition();

			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
