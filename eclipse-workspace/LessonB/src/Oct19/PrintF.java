package Oct19;

//FormatString
//포맷을 지정할 수 있다.
public class PrintF {

	public static void main(String[] args) {
		int age = 21;
		double height = 180.2;
		String name = "CHOI BEOM GYU";
		
		System.out.printf(" name: %s \n", name); //%s는 String의 약자
		System.out.printf(" age: %d \n height: %e \n\n", age, height); //%e부동 소수점
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.printf(" %g \n", 0.00014); //소숫점 자리가 6자리 이하면 %g
		System.out.printf(" %g \n", 0.000014);

	}

}
