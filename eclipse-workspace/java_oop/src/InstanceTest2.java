//객체생성
//우리가 class를 만들 수 있는 것

class A {
	int num = 155;

	public void printNum() {
		System.out.println(num);
	}
}

class B {
	int sum = 100; // 인스턴스 변수 (클라스 안, 함수 밖

	public void printSum() { // 함수 안에 있는 변수를 지역변수
		System.out.println(sum);
	}

}

class Rectangle {
	int width;
	int height;
		
	//setter함수 세터함수: 자기자신 변수에 세팅하는거
	public void setWidth(int w) { // 여기서 public 딱히 필요없지만 관습적으로 넣어줌
		width = w; // set어쩌고 할 떄는 void하고 int = 파라미터
	}
	//getter함수 게터함수: 
	public int getWidth() { // get어쩌고 할 때는 값 넘기는게 아니라서 괄호안에 함수 안 넣음.
		return width; // void가 아니니까 return하고, get어쩌고는 자기자신 불러오는거라 자기자신 넣음
	}
	
	public int getArea() {
		return width * height;
		
	}

}

//우클릭 > source > generate getter setter

public class InstanceTest2 {

	public static void main(String[] args) {
		A a; // int abc; 데이터 타입에 변수 설정하면 그게 변수 선언
		a = new A(); // 또는 처음부터 A a=new A();라고 해도 됨.

		a.printNum();

		B b = new B();

		b.printSum(); // 100

		Rectangle rec = new Rectangle(); // 위에 Rectangle 클래스 이름만 달아줘도 compile
		rec.width = 10;
		rec.height = 10; // 함수는 아니니까 멤버변수(?)
		rec.setWidth(20); // 함수 만들때는 public + return타입+함수명+파라미터 가 반드시 온다

		System.out.println(rec.width); // 20
		System.out.println(rec.getWidth()); // 20
		
		System.out.println(rec.getArea()); //200
		

	}

}










