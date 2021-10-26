package Oct26;

//9번
public class Circle {

	private int r;

	public Circle(int r) {
		this.r = r;
	}

	public String toString() {
		return "넓이는 " + (r * r * Math.PI) + "입니다.";
	}

}
