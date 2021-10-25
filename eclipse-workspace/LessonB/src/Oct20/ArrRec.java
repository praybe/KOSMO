package Oct20;

import java.util.Scanner;

class Rectangle {

	private int width, height;
	
	//생성자 생성
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

public class ArrRec {
	public static void main(String[] args) { 
		
		Rectangle[] rec = new Rectangle[3];
		
		//입력받기 위해 Scanner 돌려
		Scanner sc = new Scanner(System.in);
		
		//해당 Rectangle 배열의 방만큼 for문을 돌린다.
		for (int i = 0; i < rec.length; i++) {
			
			System.out.println("가로와 세로를 입력하세요");
			int width = sc.nextInt();
			int height = sc.nextInt();
		
			//width height을 입력받으랬으니 위에 입력받는 걸 생성
			rec[i] = new Rectangle(width, height);

		}
		
		// static함수 없을 떄는 밑에 그냥 넣으면 되는데
		// 스태틱 함수 추가하랬으니까 이걸 그대로 ctrl x 해서 static함수에 넣으면 됨
		/*
		 int sum =0;
		for (int i = 0; i < rec.length; i++) {
			sum = sum + rec[i].getArea();
		}
		System.out.println(sum);
		*/


		System.out.println("총 넓이: " + Rectangle.getRecArea(rec)); //해당 Rectangle배열을 넣어줘라
	
	}
}
