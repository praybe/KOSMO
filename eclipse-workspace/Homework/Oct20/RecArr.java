package Oct20;

//10번
/*
 Rectangle 을 배열로 3개 선언

해당 객체에 인덱스 순서대로 가로 세로 설정 - 
이번에는 반드시 scanner 로 입력 받을것

해당 배열에 있는 Rectangle 의 총넓이의 합을 구하시오.

또한 아래의 함수도 만들것(static 으로 만들것)
- 파라미터를 Rectangle 배열로 받아서 해당 배열에 들어 잇는 
Rectangle 들에 총 넓이를 리턴 하는 함수를 만드시오. 
 */

import java.util.Scanner;

class Rectangle {

	private int width, height;

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public int getArea() {
		return width * height;
	}
	
	public static int getRecArea(Rectangle[] rec) {
		int sum = 0;
		for (int i = 0; i < rec.length; i++) {
			sum += rec[i].getArea();
		}
		return sum;

	}
}

public class RecArr {
	public static void main(String[] args) { // 생성자를 안 만들었따. 이게 핵심

		Scanner sc = new Scanner(System.in);

		Rectangle[] rec = new Rectangle[3];

		// rec.length 세번돌아간다. >> for문으로 총 6개 입력
		for (int i = 0; i < rec.length; i++) {
			System.out.println("가로: ");
			int width = sc.nextInt();
			
			System.out.println("세로: ");
			int height = sc.nextInt();
		
			rec[i] = new Rectangle(width, height);
			
			System.out.println("사각형" + (i+1)+"의 넓이: " + rec[i].getArea());
			System.out.println();

		}

		System.out.println("총 넓이: " + Rectangle.getRecArea(rec));
		
	}
}
