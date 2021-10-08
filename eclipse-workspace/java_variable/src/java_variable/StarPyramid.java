//for문으로 별표 피라미드 만들기 13579 (9*9)

public class StarPyramid {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) { // blankspace

				System.out.print(" ");
			}
			
			for (int j = 1; j <= i*2-1; j++) { //star
				
				System.out.print("*");
			}
			
			System.out.println();

		}

	}

}

/*
 * 결과값
     *
    ***
   *****
  *******
 *********
 * 이렇게 나옴
 */
