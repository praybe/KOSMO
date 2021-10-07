//배수의 종류와 개수 예제
public class BreakContinue {

	public static void main(String[] args) {

	//문제1. 1과 1000 사이의 숫자 중 2의 배수이자 3의 배수인 수의 첫번 째 수를 출력

			int num = 1;
			boolean search = false;
	
			while (num <= 1000) {
				if ((num % 2 == 0) && (num % 3 == 0)) {
					search = true;
					break;
				}
				num++;
			}
			if (search)
				System.out.println("2의 배수이자 3의 배수인 수의 첫번 째 수: " + num);
			else
				System.out.println("찾지 못했습니다.");
	
			System.out.println("====================");

			
	//문제1-1. FOR문 버전 
		 
			int i;
			for (i = 1; i <= 1000; i++) {
				if ((i % 2 == 0) && (i % 3 == 0)) {
					break;
				}
			}
			System.out.println(i);
	
			System.out.println("====================");
			

	//문제2. 1과 1000 사이의 숫자 중 2의 배수이자 3의 배수는 모두 몇 개인지 출력
		
			int num1 = 1;
			int count = 0;
	
			while ((num1++) <= 1000) {
				if ((num1 % 2 != 0) || (num1 % 3 != 0))
					continue;
				count++;
			}
			System.out.println("2의 배수이자 3의 배수의 개수: " + count + "개");
			
			System.out.println("====================");
			

	//문제2-2. FOR문 버전 

			int count1 = 0;
			for (int j = 1; j <= 1000; j++) {
	
				if ((j % 2 != 0) || (j % 3 != 0)) {
					continue;
				}
				count1++;
			}
			System.out.println(count1);

			
	}
}
