package Oct22;
//2-2번

class Cake2 {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake2 extends Cake2 {
	//Cake의 yummy 메소드를 오버라이딩 함
	@Override
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public class OverRiding2 {
	public static void main(String[] args) {

		Cake2 c1 = new CheeseCake2();
		CheeseCake2 c2 = new CheeseCake2();

		c1.yummy();
		c2.yummy();

	}

}
