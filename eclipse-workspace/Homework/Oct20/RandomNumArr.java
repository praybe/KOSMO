package Oct20;
//6번

/*
 프로그램을 완성 하시오.
양의 정수 100개를 랜덤 생성하여, 배열에 저장하고, 
배열에 있는 정수 중에서 3의 배수만 출력해 보자. 
 */

public class RandomNumArr {
	public static void main(String[] args) {

		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10000 + 1);
			if (i % 3 == 0) {
				System.out.println(num[i]);

			}

		}

	}
}
