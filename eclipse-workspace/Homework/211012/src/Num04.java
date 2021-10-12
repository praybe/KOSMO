
public class Num04 {

	public static void main(String[] args) {

		System.out.println("3 factorial: " + factorial(3));
		System.out.println("3 factorial: " + factorial(12));

	}

	public static int factorial(int i) {
		if (i == 1)
			return 1;

		else

			return i * factorial(i - 1);
	}
}

/*
 * 나의 실수: return 1;이 아니라 return=1;이라고 = 부호를 썼더니 오류 뜸 i로 맞춰야하는데 어떤건 n으로 쓰고 중구난방으로
 * 적어서 오류뜸 마지막에facotrial(i-1)로 해야하는데 f(n-1)로 해서 오류뜸
 */
