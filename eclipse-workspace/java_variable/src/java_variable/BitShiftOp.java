//비트 쉬프트 연산자
public class BitShiftOp {

	public static void main(String[] args) {

		byte num;
	
		num=2; //00000010
		System.out.print((byte)(num<<1) + ""); //00000100
		System.out.print((byte)(num<<2) + ""); //00001000
		System.out.print((byte)(num<<3) + "" + '\n'); //00010000
		
		num=8; //00001000
		System.out.print((byte)(num>>1) + ""); //00000100
		System.out.print((byte)(num>>2) + ""); //00000100
		System.out.print((byte)(num>>3) + "" + '\n'); //00000001
		
		num=-8; //11111000
		System.out.print((byte)(num>>1) + ""); //11111100
		System.out.print((byte)(num>>2) + ""); //11111110
		System.out.print((byte)(num>>3) + "" + '\n'); //11111111
	
		
/* 왼쪽으로의 쉬프트는 num 값의 부등호 우측 값만큼 증가,
 * 오른쪽으로의 쉬프트는 num 값의 부등호 우측 만큼 나눈 결과  */		
	
		
	}

}
