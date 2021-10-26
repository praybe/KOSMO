package Oct26;

//오후 문제 풀이였는데 결국 해결못함 ㅠㅠ 
class Circle {

	private int r;

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public String toString() {

		return (r * r * Math.PI) + "입니다.";
	}

}

public class ObjectCircle {
	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);

	}

}
