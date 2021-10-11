
public class Num101 {

	public static void main(String[] args) {

		double area = getRecCircle(5); // 원넓이

		System.out.println(area);

	}

	public static double getRecCircle(double r) {

		final double PI = 3.14;

		return (r * r * PI);

	}

}

//결과값: 78.5