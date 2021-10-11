//12. 구구단 에서 2의 배수 이자 3의 배수인 수의 갯수는?
public class Num12 {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 2; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

				int result = i * j;

				if ((result % 2 == 0) && (result % 3 == 0)) {

					count++;

				}

			}

		}

		System.out.println(count + "개");

	}

}


//28개


