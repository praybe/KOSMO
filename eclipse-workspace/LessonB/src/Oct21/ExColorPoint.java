package Oct21;
//2차원 상의 한 점을 표현하는 Point 클래스

//Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class ColorPoint extends Point {
	private String color;
	private int i;
	private int j;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setXY(int i, int j) {
		this.i = i;
		this.j = j;
		
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		
		return getColor() + "색의 "+ "(" + i+ ", "  + j+ ")" +"의 점";
		
	}

}
/*
 * RED색의 (10,20)의 점입니다.
 */
public class ExColorPoint {
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다. ");

	}

}
