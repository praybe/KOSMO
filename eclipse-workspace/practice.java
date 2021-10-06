
public class practice {

	public static void main(String[] args) {
/* 1번. int 변수 선언 후 임의로 값을 넣음
		해당 값이 짝수 이면 "짝수 입니다" 출력
		해당 값이 홀수 이면 "홀수 입니다" 출력*/
		
		int num = 38476285;
		if (num%2==0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
		
/*2번. int 변수 3개 선언 
      임의 값 집어 넣음
      
      그 중 3개의 값 중 최대값을 출력 
      90 100 60
      
      출력:
      최대값은 100입니다. */
		
		int sis= 60;
		int bro = 90;
		int papa = 100;
	
		if ((sis > bro) &&(sis>papa)) {
			System.out.println("최대값은 "+ sis + "입니다");
		} else if ((bro > sis)&&(bro > papa)) {
			System.out.println("최대값은" + bro+ "입니다");
		} else {
			System.out.println("최대값은" + papa + "입니다");
		}
		
//위에 if문 간단하게 줄여보기, 삼항연산자도 사용해보기		
		
		
		

	}

}
