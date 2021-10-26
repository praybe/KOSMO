package Oct26;

//10¹ø
public class ShapeInterface {
	public static void main(String[] args) {

		AreaGetable area = new Circle2(4);
		System.out.println(area.getArea());

		area = new Rectangle2(4, 5);
		System.out.println(area.getArea());

		area = new Triangle2(4, 5);
		System.out.println(area.getArea());

	}

}
