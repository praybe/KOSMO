package Oct21;

//문제 5번
public class ColorPointSuper extends PointSuper {

	private String color;

	public ColorPointSuper(int x, int y, String color) {
		super(x, y);
		this.color = color;

	}
	
/*	public String getColor() {
		return color;
	}*/
	
	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public String toString() { //super.get으로 들고와야하네...
		
		String str = null;; //이거 안 넣음
		str = color + "색의 (" + super.getX() + ","+super.getY()+")의 점";
		//super.getX()가 10, super.getY()는 20
		 return str;
		
	}

}



/*
 * 
 * cp.setXY(10, 20); 
 * cp.setColor("RED"); 
 * String str = cp.toString();
 * System.out.println(str + "입니다. ");
 */
