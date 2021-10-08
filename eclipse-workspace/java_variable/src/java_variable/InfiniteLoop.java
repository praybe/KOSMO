//무한루프: 

public class InfiniteLoop {

	public static void main(String[] args) {

//do while 문으로 무한 반복
		do {
			
			System.out.println("Hello World");
			
		} while (true);

		
		
// while과 break로 무한루프
	//6의 배수면서 14의 배수인 가작 작은 자연수 찾기
		int num = 1;

		while (true) {
			
			if ((num % 6 == 0) && (num % 14 == 0))
				
				break; // 무한 반복문은 break없이 절대 빠져나올 수 없다.
			
			num++;
		
		}

	}
}
