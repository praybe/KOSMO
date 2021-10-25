package Oct21;
//문제 5번
public class PointSuper {

	private int x, y;

	public PointSuper(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public void setXY(int x, int y) { //세터가 여기로 와야함
		this.x = x;
		this.y = y;
		
	}

}