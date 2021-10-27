package Oct27;

abstract class A {
	// 일반적인 클래스에서는 함수를 모두 구현해야 함.
	public void one() {
		System.out.println("메소드 하나");
	}

	public abstract void two(); // 온전하지 않음. 자손이 구현해라

}

class B extends A {
	@Override
	public void two() {
		System.out.println("메소드 둘");
	}

}

public class AbstractClass {
	public static void main(String[] args) {

		B b = new B();
		b.one();
		b.two();
		
		//polyMorphism적용해보자
		//메모리에 올리는건 안되지만 자손을 통해서는 가능함
		A a = new B();
		a.one();
		a.two();

	}

}
