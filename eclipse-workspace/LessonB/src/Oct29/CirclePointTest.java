package Oct29;

class Circle{
	private int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.radius=radius;
		this.x=x;
		this.y=y;
		
	}
	
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")"+ "반지름"+radius;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Circle) {
		
		Circle circle = (Circle)obj;
		
		if( ( this.x == circle.x ) && ( this.y == circle.y ) )
			return true;
		}
			return false;
		
	}
	
	
}
public class CirclePointTest {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5); //중심 (2,3)에 반지름 5인 원
		Circle b = new Circle(2, 3, 30); //중심 (2,3)에 반지름 30인 원
		
		System.out.println("원 a : " +a);
		System.out.println("원 b : " +b);
		
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");

	}

}
