//팩토리얼 구현의 예
public class ReculFactorial {

	public static void main(String[] args) {

		System.out.println("3 factorial: " + factorial(3));
		System.out.println("12 factorial: " + factorial(12));

	}

	public static int factorial(int n) {
		if (n == 1)
			return 1;

		else
			return n * factorial(n - 1);  //팩토리얼도 메소드 형태라서 재귀호출이 가능해짐.

	}

}
