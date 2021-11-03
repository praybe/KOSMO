package Nov03;

class DBox2<L, R> {
	private L left;
	private R right;

	public void set(L left, R right) {
		this.left = left;
		this.right = right;

	}

	@Override
	public String toString() {
		return left + " & " + right;
	}

}

public class DDBoxDemo2 {
	public static void main(String[] args) {

		DBox2<String, Integer> box = new DBox2<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);

		DBox2<String, String> box3 = new DBox2<String, String>();
		box3.set("Apple", "Orange");
		System.out.println(box3);

	}

}
