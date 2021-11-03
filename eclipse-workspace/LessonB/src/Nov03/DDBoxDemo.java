package Nov03;
//내가 못푼거 ㅠㅠ
class DBox2<L, R> {
	private L left;
	private R right;

	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	// 내가 안한거
	@Override
	public String toString() {
		return left + "," + right;
	}
}

class DDBox2<L, R> {
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left + "\n" + right;
	}

}

public class DDBoxDemo {
	public static void main(String[] args) {
		DBox2<String, Integer> box1 = new DBox2<>();
		box1.set("Apple", 25);

		DBox2<String, Integer> box2 = new DBox2<>();
		box2.set("Orange", 33);

		DDBox2<DBox2<String, Integer>, DBox2<String, Integer>> ddbox = new DDBox2<>();
		ddbox.set(box1, box2);

		System.out.println(ddbox);

	}

}
