package edu.kosmo.ex.main;

public class Boat{
	
	void myBoat() {
		System.out.println("ㅎㅎㅎ");
	}
	
	//어느 클래스든 자리를 빌려올 뿐
	//그래서 메인 안에서는 맘대로 하면 됨
	//해당 객체르 호출하면 됨.
	//main을 품은 class와 파일명을 맞춰야 함
	public static void main(String[] args) {
		Car car = new Car();
		car.myCar();
		
		Boat boat = new Boat();
		boat.myBoat();
		
	}
		
}
	
	
class Car{
		
		void myCar() {
			System.out.println("하하하");
		}
		

}
