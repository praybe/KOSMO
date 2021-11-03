package Nov02;

import java.util.Arrays;

class Rectangle implements Comparable {
	private int x, y;

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getArea() {
		return x * y;
	}

	@Override
	public int compareTo(Object o) {
		Rectangle rec = (Rectangle) o;
		return rec.getArea() - this.getArea();
		//바로 형변환 시켜서 호출 ((Rectangle) o).getArea() - this.getArea(); 선생님 방법

	}
	
	/*@Override
	public String toString() {
		return String.valueOf(getArea());
	}*/


}

public class ArraysRecArea {
	public static void main(String[] args) {

		Rectangle[] recArr = { new Rectangle(6, 6), new Rectangle(5, 5), new Rectangle(10, 10),
									new Rectangle(12, 12), new Rectangle(11, 11) };

		Arrays.sort(recArr); //정렬시켜
		for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
		}
		
		//한줄로 꺼내고 싶으면 이거 쓰고 System.out.println(Arrays.toString(recArr)); 
		//다만 toString 써먹어야하니까 오버라이딩 해줘야 함

	}

}
