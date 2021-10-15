package num10.rectangle;

class Rectangle {

	private int x, y, width, height;

	Rectangle(int x, int y, int width, int height) {

		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("(" + x + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");

	}

	public int square() {
		return width * height;
	}
	
	private boolean contains(int x, int y) {
		Rectangle = r;
		if (((this.x < r.x) && ((this.x + this.width) > (r.x + r.width))) {
			return true;
		}
	}

	boolean contains(Rectangle r) {
		
		if ((this.x < r.x) && (this.x + this.width) > (r.x + r.width)) {

		} else {
			
		}

	}

}
