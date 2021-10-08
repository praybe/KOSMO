//for문으로 별표 직각삼각형 Right Triangle

public class StarRT {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {   //1부터 i까지

				System.out.print("*");
			}
			
			System.out.println();
		}

		/*
		 * 결과값
		 *
		 **
		 ***
		 ****
		 ***** 
		 * 이렇게 나옴
		 */
		// 세로: 5 4 3 2 1 가로:1 2 3 4 5

		// 소스코드 상 첫번 쨰 줄에 한 개를 찍으려면 어느 부분이 어떻게 되어야 할까
		// 힌트: i == j

	}

}
