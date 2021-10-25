package Oct19;

import java.util.Arrays;

/*
★ 로또 번호 구하기 ★
1. int 담는 6개 배열 선언
2. 각각의 배열에 랜덤으로 1 ~ 45 (랜덤함수 담기)
3. 중복 제거 (제일 중요 ㅋㅋ) 해서 6개 출력
*/




public class Lottery {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		System.out.println("랜덤 번호를 알려 드립니다.");
		
	
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45+1);	
			
			for(int j = 0; j < i; j++) { 
                if (lotto[i] == lotto[j]) {
                    i--;	   
                    break;     
                }
               
			}			
			
		}
		System.out.println(Arrays.toString(lotto));
		// System.out.println(lotto); << 이렇게 쓰고 싶을떈 차라리 위에것을 쓰고 
		 
		 
		//for (int i = 0; i < lotto.length; i++) {
			//System.out.println(lotto[i]);  <<썜이랑 교실에서 한건 이거
		//}

		
		
	}
}
