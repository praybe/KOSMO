
public class Oct7th {

	public static void main(String[] args) {
			
/* 1번.  switch 문에서 아래의 프로그래밍을 짜시오.
1234 월 봄입니다. 출력 5678 월 여름입니다.출력 9 10 11 12 월 겨울 입니다. 출력*/
				int n = 101;
				switch (n) {
				case 1:case 2:case 3:case 4:
					System.out.println("봄입니다."+ '\n');
					break;
					
				case 5:case 6:case 7:case 8:
					System.out.println("여름입니다."+ '\n');
					break;
					
				case 9:case 10:case 11:case 12:
					System.out.println("겨울입니다."+ '\n');
					break;
				
				default:
					System.out.println("찾을 수 없습니다."+ '\n');
					break;
				}
				
	
		
/* 2번. int num = -10 을 할당 후 해당 정수에 대한 절댓값을 출력하는 프로그램을 작성하시오. 절대값은 양수 입니다.*/
				
				int num = -10;
				if(num<0) {
					num=-num;
				}
				System.out.println("-10의 절대값: " +num);
				
			// 절대값 공식 이용		
				int num2 = -10;
				int result = Math.abs(num2);
				System.out.println(result);
	
				System.out.println('\n');
				
			/*	완벽한 나의 오답.. 값도 안나옴 
			 * int num = -10;				
				for (num = -10 ; num <100 ; num++) {
					num = 10;
				
				} System.out.println(num+ '\n');
				*/
				
				
				

/* 5. 구구단 6단을 출력 하는 프로그램을 짜시오.*/
				int i ;
				int dan = 6; 
					for( i =1 ; i <10 ; i++ ) {
						System.out.println(dan + " * " + i + " = " + i*dan);
					}
		
		System.out.println('\n');
				
				
/*6. 1부터 10000 까지의 합을 구하는 프로그램을 짜시오.*/
				int j;
				int sum =0;
					for (j=1 ; j <= 10000 ; j++) {
						sum = j + sum;
					}System.out.println("1부터 10000까지의 합: " + sum+ '\n');
				
							
				
/* 7번. 1부터 10000 까지의 숫자 중 홀수 의 합을 구하는 프로그램을 짜시오.*/
			
				int sum2 = 0;
				for (int k = 1; k <= 10000; k++) {
					if (k % 2 == 1) {
						sum2=sum2+k;
					}
				}
				System.out.println("1부터 10000까지의 합: " + sum2 + '\n');

		/*나의 오답
		 * if(k%2==0)가 아니라 if(k%2==1)라고 했어야 함. 
		 * if 중괄호 밖에 있는게 중괄호 안에 들어가야 함.
				int k;
				int sum2 = 0;
					for(k=1 ; k <=10000; k++) {
						if(k%2==0) {
							k=0;
						}
						sum2= k +sum2;
						
					} System.out.println("1부터 10000까지의 합: " + sum2 + '\n');
				*/
							
					
							
/* 9번. 1과 100 사이의 숫자 중 5의 배수이자 7의 배수의 첫번재 수는(프로그램밍 하시오)*/
					int m;
					
					for(m=1; m<100; m++) {
						if( (m%5==0) && (m%7==0) ) {
							break;
						}
					} System.out.println("5의 배수이자 7의 배수의 첫번재 수: " + m+ '\n');
				
							
						/*나의 오답
						 * continue와 break위치, continue넣으니까 답 1나옴  
						    int m;
							for(m=1; m<100; m++) {
								if( (m%5==0) && (m%7==0) ) {
									continue;             
								}break;
							} System.out.println(m); */
							
														
														
							
/* 10번. 1과 10000 사이의 숫자 중 5의 배수이자 7의 배수의 첫번재 수는(프로그램밍 하시오) count 사용*/
					
					int p;
					int count = 0;
					for (p = 1; p < 10000; p++) {
						if ((p % 5 == 0) && (p % 7 == 0)) {
							break;
						}
						count++;
					}
					System.out.println("5의 배수이자 7의 배수의 첫번재 수: " + p+ '\n');

				/* 나의 오답 
				 * 첫번째 수가 아니라 총 개수 구하고 심지어 틀림 count 변수 설정만 하고 숫자 제시 안함. count++위치 틀림 
				 * int = p; 
				 * int = count; 
				 * 	for(p=1; p<10000; p++) { 
				 * 		if((p%5!=0)||(p%7!=0)) { 
				 * 			continue; 
				 * 		} 
				 * 	} count++; //자꾸 오류 뜸
				 * System.out.println(count); */
				
				/* 개수 구하는 옳은 방법 
				 * int p; 
				 * int count=0; 
				 * 	for(p=1; p<10000; p++) {
				 * 		if((p%5!=0)||(p%7!=0)) { 
				 * 			continue; 
				 * 		} count++; 
				 * 	}
				 * System.out.println(count); */
		
		

	}

}
