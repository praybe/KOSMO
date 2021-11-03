package Nov01;

import java.security.Identity;

public class AutoBoxing {
	public static void main(String[] args) {

		Integer iObj = new Integer(10); // 冠教
		Double dObj = new Double(3.14); // 冠教

		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();

		int num1 = iObj.intValue(); // 攫冠教
		double num2 = dObj.doubleValue(); // 攫冠教

		iObj = new Integer(iObj.intValue() + 10);
		dObj = new Double(dObj.doubleValue() + 1.2);

		System.out.println(num1);
		System.out.println(num2);

	}

}
