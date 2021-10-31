package Oct29;
//Clone을 사용해서 객체생성하


class Point implements Cloneable { // 내가 복제대상이 됨을 jvm에게 알려주는 것
	private int xPos; // x좌표
	private int yPos; // y좌표

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Object 클래스의 clone 메소드 호출
	}

}

 class InstanceCloning {
	public static void main(String[] args) {
		// 메인 가진 놈이 객체생성

		Point org = new Point(3, 5); // 여태껏 객체생성하려면 new를 씀
		Point cpy; // 객체생성을 하는 또 다른 방법. 즉 Clone하는 방법. 메모리에 올라감

		try {
			cpy = (Point) org.clone(); // Clone해서 cpy에 집어 넣어
			org.showPosition();
			cpy.showPosition();  //cpy에도 객체 생성 되었다는 말

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
