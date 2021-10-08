//이중포문
//구구단 결과값이 2의 배수이자 3의 배수인수의 개수 ▶괴어렵다 ;;	System.out.println();

public class FIFtimestable4 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				int result = i * j;

				if (result % 2 == 0 && result % 3 == 0) {
					count++;
					System.out.println(i + "*" + j + "=" + result + " 갯수:" + count); // 결과값이 이거. 여기서 배수 개수를 뽑아내자
				}

			}
			System.out.println();

		}
		System.out.println("갯수는" + count);

		/*
		 * 어딘가 엉성한 답... int count=0 ; //숫자까지 지정해줘야 하단 중괄호 내 count++할때 오류가 안뜸 !!
		 * 
		 * for (int i =2; i <=9; i++) {
		 * 
		 * for(int j =1; j<= 9; j++) { int result = i*j;
		 * 
		 * if((result %2==0) && (result %3 ==0)) {
		 * 
		 * count++;
		 * 
		 * } }
		 * 
		 * System.out.println(count); //결과 값이 .. 3 7 10 11 ...28나옴  ㅋㅋ
		 * 
		 * }
		 */

	}

}
