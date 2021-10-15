package edu.kosmo.ex.main;

class Boat2{
	
	void myBoat() {
		System.out.println("ㅎㅎㅎ");
	}
		
}

	public class Car2 {
		
		void myCar() {
			System.out.println("하하하");
		}
		
		//어느 클래스든 자리를 빌려올 뿐
		//그래서 메인 안에서는 맘대로 하면 됨
		//해당 객체르 호출하면 됨.
		public static void main(String[] args) {
			Car2 car = new Car2();
			car.myCar();
			
			Boat2 boat = new Boat2();
			boat.myBoat();
			
		}
		
	}	
		


		

