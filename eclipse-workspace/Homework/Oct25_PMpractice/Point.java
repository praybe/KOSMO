package Oct25_PMpractice;

//3번
public class Point {

	private int x, y, z;

	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void moveUp() {
		this.z = ++z; // 날 엄청 힘들게 함 ㅋㅋㅋ
	}

	public void moveDown() {
		this.z = --z;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void setXYZ(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

}
