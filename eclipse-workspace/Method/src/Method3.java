//값을 반환하는 메소드
//함수 명 앞에 데이터 타입이 오는 경우

public class Method3 {

	public static void main(String[] args) { // void는 값을 반환하지 않음을 의미

		int result;
		result = adder(4, 5); // adder가 반환하는 값을 result에 저장
		
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));

	}

	public static int adder(int num1, int num2) {

		int addResult = num1 + num2;
		return addResult; // addResult의 값을 반환

	} // return: 값의 반환을 명령

	public static double square(double num) {

		return num * num; // num*num의 결과를 반환

	}

}
