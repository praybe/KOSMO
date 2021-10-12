//재귀호출의 대표: 팩토리얼 (!)
public class FactorialBasic {

	public static void main(String[] args) {

	}

	public static int factorial(int n) {
		if (n == 1)
			return 1; // n이 1일떈 자기 자신 호출.

		else
			return n * factorial(n - 1); // 자기 자신의 함수에서 자기 자신의 함수 호출

	}

}