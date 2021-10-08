//for문으로 별표 좌향 역직각삼각형 

public class StarRTInverseleft {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) { // 공백 담당 for(int j = 5; j >= i; j--)도 가 

				System.out.print(" ");

			}

			for (int j = i; j <= 5; j++) { // 별 담당

				System.out.print("*");
			}

			System.out.println();

		}

	}

}


/*
  결과값
*****
 ****
  ***
   **
    *
  이렇게 나옴
 */
