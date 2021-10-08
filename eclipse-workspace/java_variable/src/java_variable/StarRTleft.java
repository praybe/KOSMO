//for문으로 별표 좌향 직각삼각형

public class StarRTleft {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			// 일단 초기값 4개
			for (int j = 4; j >= i; j--) { // 공백 담당

				System.out.print(" "); // 답이 안나온 이유는 스페이스바를 안눌렀고 상단 for문 오류

			}

			for (int j = 1; j <= i; j++) { // 별 담당

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

		/*
		 * for (int i = 1; i <= 5; i++) {
		 * 
		 * for (int j =1; j<i; j++) { //공백 담당
		 * 
		 * System.out.print("");
		 * 
		 * }
		 * 
		 * for (int j = 1; j <= i; j++) { // 별 담당
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */

//hint 공백4개 공백 3개 공백 2개 ...

	}

}
