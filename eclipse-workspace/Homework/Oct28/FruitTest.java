package Oct28;

/*interface Fruit { //인터페이스 안에는...(못들음 .. 
	public abstract void print();
}*/

abstract class Fruit { 
	public abstract void print();
	
	public void print2() {
		System.out.println("추상클래스 안에는 일반 함수도 가능하다.");
	}

};

class Grape extends Fruit {

	@Override
	public void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple extends Fruit {
	@Override
	public void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear extends Fruit {
	@Override
	public void print() {
		System.out.println("나는 배이다.");
	}
}

public class FruitTest {
	public static void main(String[] args) {

		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };
		for (Fruit f : fAry)
			f.print();

	}

}
