package Nov04;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class Toy {
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler {
	public static void outBox(Box<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}

	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);
	}

}

public class Wildcards {
	public static void main(String[] args) {

	}

}
