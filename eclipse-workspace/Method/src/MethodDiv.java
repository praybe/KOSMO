//메소드 연습
//반드시 암기 !!!!
//div나누기 int로 하든 double로 보든 상관없이

public class MethodDiv {

	public static void main(String[] args) {

		int num = div(6, 0);
		System.out.println(num);

	}

	public static int div(int num1, int num2) {

		int result;

		if (num2 == 0) {

			result = 0;
			System.out.println("0이 입력되었습니다. 잘못된 입력입니다.");

		} else {

			result = num1 / num2;

		}

		return result;

	}

}
