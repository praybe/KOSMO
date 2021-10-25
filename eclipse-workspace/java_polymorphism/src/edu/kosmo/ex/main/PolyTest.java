package edu.kosmo.ex.main;
//10월 22일 오후수업

//새
//- 참새 Sparrow
//- 비둘기 
//- 고무새

class Bird{
	
	public void fly() {
		System.out.println("새는 날아 다닙니다.");
	}
	
}



class Sparrow extends Bird {
	public void fly() {
		System.out.println("한 번에 100미터만 날아 다닙니다.");
	}
}

class Pizone extends Bird  {
	public void fly() {
		System.out.println("한 번에 2000미터만 날아 다닙니다.");
	}
}

class RubBird extends Bird  {
	public void fly() {
		System.out.println("날지 못 합니다.");
	}
}

public class PolyTest {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.fly();
		
		//PolyMorphism 적용
		bird = new Sparrow();
		bird.fly();
		
		bird = new Pizone();
		bird.fly();

		
		//실무에서 이렇게 짠다.
		//배열과 함수오버라이징이 절묘하게 어우러짐. 
		Bird[] arrBir = {new Bird(), new Sparrow(), new Pizone()};
		for (Bird bird2 : arrBir) {
			bird2.fly();
		}
				

	
	}

}
