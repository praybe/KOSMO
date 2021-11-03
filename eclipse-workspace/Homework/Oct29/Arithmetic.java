package Oct29;

//값이 안나옴 ㅋㅋ ;;
//7번
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();

		Calc cal = null;// 첨엔 null로 선언

		switch (op) {
		case "+":
			cal = new Add();
			break;
		case "-":
			cal = new Sub();
			break;
		case "*":
			cal = new Mul();
			break;
		case "/":
			cal = new Div();
			break;

		default:
			System.out.println("잘못된 연산자 입력입니다.");
		}
		cal.setValue(a, b); // polymorphism 적용. ab가 딱딱 저장됨
		System.out.println(cal.calculate());

	}
}
