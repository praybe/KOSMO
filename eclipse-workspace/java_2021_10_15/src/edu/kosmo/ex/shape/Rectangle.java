package edu.kosmo.ex.shape;


/*
 - int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보
- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
- int square() : 사각형 넓이 리턴
- void show() : 사각형의 좌표와 넓이를 화면에 출력
- boolean contains(Rectangle r) : 
매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴 
(겹치면 안됨. 완전히 안에 있어야 true)
- main() 메소드의 코드와 실행 결과는 다음과 같다.
 */

//출력:
// (2,2)에서 크기가 8x7인 사각형
// s의 면적은 36
//	t는 r을 포함합니다


public class Rectangle{
	private int x, y, width, height;
	
	//생성자 만들기
	public Rectangle(int x, int y, int width, int height) {
		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;
				
	}
	
	public void show() {
		//출력값 "(2,2)에서 크기가 8x7인 사각형" 복붙해서 수정
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
		
	}
	
	
	public int square() {
		return width*height;
	}
	
	 
						 //r은 비교대상 것								
	public boolean contains(Rectangle r) {
		//어차피 boolean으로 리턴해야하니까
		boolean bool = false;
		
		//내거 x하고 비교대상의 x 비교. 일단 이게 참이어야 함
		//x좌표에서 내거보다 쟤가 더 크면 쟤 가로 길이가 짧겠지 
		if( (this.x < r.x) && ((this.x + this.width) > (r.x+r.width))   
				 //좌표 + 길이는 가로 길이. 나의 가로길이가 비교대상 것보다 크면 내 사각형이 큰거 
		//이번엔 y값 비교
			&& (this.y < r.y) && ((this.y + this.height) > (r.y+r.height))					
				){
			bool = true;
		}
		                      		
		return bool;
		
	}
	
	
	
}
