package Nov04;

class Box7<T> {
	private T num;

	public void set(T num) {
		this.num = num;
	}

	public T get() {
		return num;
	}

}

public class Swap {
	public static void main(String[] args) {
		Box7<Integer> box1 = new Box7<>();
		box1.set(99);

		Box7<Integer> box2 = new Box7<>();
		box2.set(55);

		System.out.println(box1.get() + " & " + box2.get());

		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());

	}

	public static <T> void swapBox(Box7<T> box1, Box7<T> box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);

	}

}

//99 & 55
//55 & 99
