//for문으로 별표 5x5만들어보기 (역시나 암기 !!)

public class StarSquare {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		/*
		 결과값
		 *****
		 *****
		 *****
		 *****
		 ***** 
		 
		 */

		/*
		 * 오답 ㅠㅠ for(int i=1; i<5; i++) { System.out.println("*"); //println위치와 중괄호 개수
		 * 때문에 오답. for(int j=1; j<5; j++) // 중괄호 2개. 각각의 중괄호에 들어갈 print와 println 위치 다름
		 * System.out.print("*"); } 나의 답은 ...
		 *
		 *****
		 *****
		 *****
		 ****
		 * 이렇게 나옴..ㅠㅠ
		 */

	}

}
