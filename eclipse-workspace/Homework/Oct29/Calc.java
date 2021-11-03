package Oct29;
//7번
abstract class Calc {
	protected int a, b; //상속할거라서 protected
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}

