package Oct27;

import java.util.Scanner;

//6번
//try catch 넣는 것이 핵심
public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int result = 0;

		// char op = 0; 도 가능함.
		String op = null; // 문자열로 받을 수 있음. String 안에 엄청 난 함수들이 있기 떄문에 문자열을 다룰 수 있음.

		while (true) {

			try {

				Scanner sc = new Scanner(System.in);

				System.out.println("*** 계산기 ***"); // 타이틀 출력
				System.out.println("수1 : ");
				num1 = sc.nextInt();

				System.out.println("수2 : ");
				num2 = sc.nextInt(); // 변수 반드시 num2로 구분

				System.out.println("연산 : ");
				op = sc.next(); // x+-% 연산자 문자 받는 거

				switch (op) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;

				default:
					System.out.println("잘못된 연산자 입력입니다.");
					result = 0;
				}

				System.out.println("계산 결과: " + result);

				System.out.println("계속 하시겠습니까? 계속 : Y  |  종료 : N");
				String finish = sc.next();

				if (finish.equals("N") || finish.equals("n")) {
					break;
				}

			} catch (Exception e) {

				System.out.println("잘못된 입력입니다. 처음부터 다시 입력하세요.");
				continue;

			}
		}

		System.out.println("계산 결과: " + result);
	}
}
