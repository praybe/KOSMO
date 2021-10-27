package Oct27;

interface AreaGetable {

	double getArea();
}

class Circle implements AreaGetable {
	private double r;
	public int length;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}

}

class Rectangle implements AreaGetable {
	public static final int length = 0;
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}


class ShapeCondOp {

	private static double getAllArea(AreaGetable[] area) {
		double sum = 0;

		for (AreaGetable areaGetable : area) {
			sum += areaGetable.getArea();

		}

		for (int i = 0; i < area.length; i++) {
			sum += area[i].getArea();
		}

		return sum;
	}

/*내가 한 방법. 답은 나오는데 복잡하게 씀
	private static double getArea(AreaGetable area) {
		
		if (area instanceof Circle) {
			return area.getArea();
		} else if (area instanceof Rectangle) {
			return area.getArea();
		} else 
			System.out.println("오류입니다.");
		
		return area.getArea();
		

	}*/
	
	//함수오버라이딩
	private static double getArea(AreaGetable area) {
		return area.getArea();
	}

	public static void main(String[] args) {

		AreaGetable[] area = { new Rectangle(4, 5), new Circle(4) };

		// AreaGetable oneArea = new Circle(4);
		System.out.println(getAllArea(area));
		System.out.println(getArea(new Circle(10))); //314
		System.out.println(getArea(new Rectangle(4, 5))); //20

		// oneArea = new Rectangle(4, 5);
		// System.out.println(area.getArea());

	}

}
