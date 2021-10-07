//반복문 for 구문 
public class ForBasic {

	public static void main(String[] args) {

	// 문제3. 1부터 100까지의 수 중에서 홀수의 합을 구하는 프로그래밍을 하시오.

			int sum = 0;
			for (int i = 1; i <= 100; i++) {   //j++ 대신 처음부터 +2를 해줘도 된다.
	
				if (i % 2 == 1) { 				// sum이 아니라 i를 넣어
					sum = sum + i;
				}
			}
			System.out.println("sum : " + sum);
	
			System.out.println("============");
						
	
	// 문제3-1. 1부터 100까지의 수 중에서 짝수의 합을 구하는 프로그래밍을 하시오.
			
			int sum2 = 0;
			for (int j = 1; j <= 100; j++) {
	
				if (j % 2 == 0) {
					sum2 = sum2 + j;
				}
			}
			System.out.println("sum : " + sum2);
			
			System.out.println("============");
			
			
	//문제4. 1과 1000 사이의 숫자 중 2의 배수이자 3의 배수인 수와 합		
			
			int sum3 = 0;
			for (int k = 1; k <= 1000; k++) {
		
				if ((k % 2 == 0) && (k % 3 == 0)) {
					sum3 = sum3 + k;
					System.out.println(k);
				}
			}
		
			System.out.println("sum : " + sum3);

		

	}
}
