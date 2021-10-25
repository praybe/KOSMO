package Oct25;

class Cake{
	
}

class CheeseCake extends Cake{
	
}

class StrawberryCheeseCake extends CheeseCake{
	
}

public class InstanceOf {
	public static void main(String[] args) {
		Cake cake = new StrawberryCheeseCake();
 
		//왼쪽 해당객체(변수명) instance of 오른쪽 class명
		if (cake instanceof Cake) {  //if (cake > Cake) 
			System.out.println("케익 인스턴스 or");
			System.out.println("케익 상속하는 인스턴스 \n");

		}
		//왼쪽 객체가 오른쪽을 가지고 있는지
		if (cake instanceof CheeseCake) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("치즈케익 상속하는 인스턴스 \n");

		}
		if (cake instanceof StrawberryCheeseCake) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익 상속하는 인스턴스 \n");

			//전부다 true 나옴. 
			//영어가 되면 직감적으로 외우면 됨.
			//~의 객체
			//instance: ~의 예를 들어 라는 사전적 의미
	
			
		}

	}

}
