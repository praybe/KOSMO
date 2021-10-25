package Oct20;
//7번

/*
 프로그램을 완성 하시오.

- 5개의 숫자를 랜덤 으로 받아 배열로 저장
- 5개의 숫자 중 가장 큰 값을 출력
 */

public class MaxNumArr {
	public static void main(String[] args) {

		// enhanced for
		int[] num = new int[5];
		int max = num[0]; //이게 핵심

		for (int e : num) {
			e = (int) (Math.random() * 100 + 1);
			System.out.print(e + " ");

			if (e > max) {
				max = e;
				
			}
			
		}
		System.out.println();
		System.out.println("최대값은: " + max);

	}
}
