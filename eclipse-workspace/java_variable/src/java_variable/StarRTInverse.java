//for문으로 별표 우향 역직각삼각형 

public class StarRTInverse {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j <= 5; j++) { // i부터 5까지

				System.out.print("*");
			}
			
			System.out.println();
		}

		/*
		 * 
		 * for(int i=5; i>=1; i--) {
		 * 
		 * for(int j=1; j<=i; j++) { //i부터 5까지
		 * 
		 * System.out.print("*"); } System.out.println(); }
		 */

		/*
		 * 결과값
		 *****
		 ****
		 ***
		 **
		 * 
		 * 이렇게 나옴
		 */

	}

}
