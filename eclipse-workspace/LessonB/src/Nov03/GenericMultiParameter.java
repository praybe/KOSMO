package Nov03;

class DBox<L, R> {
	private L left; // ¿ÞÂÊ ¼ö³³ °ø°£
	private R right; // ¿À¸¥ÂÊ ¼ö³³ °ø°£

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}

}

public class GenericMultiParameter {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);

		DBox<String, String> box2 = new DBox<String, String>();
		box2.set("Apple", "Orange");
		System.out.println(box2);

	}

}
