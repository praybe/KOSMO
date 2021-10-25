import java.util.Scanner;
class Circle{
	
	private int r;  //private 안 붙임 ㅠ 
	
	public Circle(int r) {
		this.r = r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
	
	
}


public class CircleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("반지름을 입력 하세요.");
		int r = sc.nextInt();
		
		Circle circle = new Circle (r);
		System.out.println(circle.getArea());
		

	}

}
