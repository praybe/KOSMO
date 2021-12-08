//for문으로 별표 좌향 역직각삼각형 

public class StarRTInverseleft {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) { // 공백 담당 for (int j = 4; j >= i; j--)가능

				System.out.print(" ");

			}

			for (int j = i; j <= 5; j++) { // 별 담당 위에가 j--일경우 for (int j = 1; j <= i; j++)이걸로

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
