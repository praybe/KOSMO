package Nov02;
//ArrayClass 4

import java.util.Arrays;

class INum {
	private int num;

	public INum(int num) {
		this.num = num;
	}
	
	/*�������̵� �ϸ� true ����
	@Override
	public boolean equals(Object obj) {
		if (this.num == ((INum) obj).num)
			return true;
		else
			return false;

	}*/
}
	public class ArrayObjEquals {

	public static void main(String[] args) {
		INum[] ar1 = new INum[3];
		INum[] ar2 = new INum[3];

		ar1[0] = new INum(1);
		ar2[0] = new INum(1);

		ar1[1] = new INum(2);
		ar2[1] = new INum(2);

		ar1[2] = new INum(3);
		ar2[2] = new INum(3);
		
		
		System.out.println(Arrays.equals(ar1, ar2));

	}

}

//new�� ���ؼ� �ּҰ��� �ٸ��Ƿ� false�� ����