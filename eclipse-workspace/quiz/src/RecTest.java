import java.util.Scanner;

class Rectangle{
	
	private int width, height; //private 안 붙임 ㅠ 
	
	public Rectangle(int width, int height) {
		
		this.height = height;
		this.width = width ;		
	}
	
	public int getArea() {
		return width * height ;
		
	}
	
}

public class RecTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 입력 하세요");
		int width = sc.nextInt();
		System.out.println("세로 입력 하세요");
		int height = sc.nextInt();
		
		Rectangle rec = new Rectangle (width, height);
		System.out.println("넓이는 " + rec.getArea() + " 입니다.");
		

	}

}
