package Nov03;

class Apple1 {

	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange1 {

	@Override
	public String toString() {
		return "I am an orange.";
	}
}

//다음 상자는 사과도 오렌지도 담을 수 있다.
class Box1 {
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class BeforeGeneric {
	public static void main(String[] args) {

		// 객체로 박스 생성
		Box1 aBox = new Box1();
		Box1 oBox = new Box1();

		// 과일을 박스에 담은 것일까?
		aBox.set("Apple");
		oBox.set("Orangea");

		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple1 ap = (Apple1) aBox.get(); // 반드시 형변환. object로 되어있기떄문
		Orange1 og = (Orange1) oBox.get();

		System.out.println(ap);
		System.out.println(og);

		// 과일 담는 박스 생성
		AppleBox1 aBox = new AppleBox1();
		OrangeBox1 oBox = new OrangeBox1();

		// 과일을 박스에 담는다.
		aBox.set(new Apple1());
		oBox.set(new Orange1());

		// 박스에서 과일을 꺼낸다.
		Apple1 ap = aBox.get();
		Orange1 og = oBox.get();

		System.out.println(ap);
		System.out.println(og);

	}

}
