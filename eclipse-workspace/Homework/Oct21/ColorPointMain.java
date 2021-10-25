package Oct21;
//문제 5번
public class ColorPointMain {
	public static void main(String[] args) {
		
		ColorPointSuper cp = new ColorPointSuper(5, 5, "YELLOW");
		
		cp.setXY(10, 20);
		cp.setColor("RED");
		
		String str = cp.toString();
		
		System.out.println(str + "입니다. ");

	}

}


/*
=======================
RED색의 (10,20)의 점입니다.
*/