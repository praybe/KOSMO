package Nov03;

class Apple {

	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {

	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class GenericBase {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		aBox.set(new Apple());
		oBox.set(new Orange());

		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);

		System.out.println();
		// ================================

		Box<Integer> iBox = new Box<Integer>();
		iBox.set(125); // 오토 박싱 진행
		int num = iBox.get(); // 오토 언박싱 진행
		System.out.println(num);

		System.out.println();
		// ================================

		Box<String> sBox = new Box<>();
		sBox.set("I am so happy");

		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);

		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);

		System.out.println(zBox.get().get().get());

	}

}
