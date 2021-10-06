
public class Oct6th {

	public static void main(String[] args) {
		
		
//5번
				int num1 = 10, num2 = 20, num3 = 30;
				num1 = num2 = num3;    

				/*
		      = 연산자는 결합 방향이 오른쪽에서 왼쪽으로 진행된다.  ->
		      따라서 위의 문장은 다음과 같다. 
		      num1 = (num2 = num3);        
		    */
		    
			    System.out.println(num1);	
			    System.out.println(num2);
			    System.out.println(num3);
			    
			    System.out.println("=================");
			    
			    
			    
//6번
			    int result = 3 + 6;
				System.out.println("3 + 6 = " + result);  
				result += 9;
			    System.out.println("3 + 6 + 9 = " + result);
			    result += 12;
			    System.out.println("3 + 6 + 9 + 12 = " + result);
			    
			    System.out.println("=================");
			    
			    
			    
			    
//11번	

				int num11 = 38476285;
			
				if (num11%2==0) {
					System.out.println("짝수 입니다");
				} else {
					System.out.println("홀수 입니다");
				}
				System.out.println("=================");
				
				
				
				
//10번		
				/* int 변수 3개 선언 
			      임의 값 집어 넣음
			      
			      그 중 3개의 값 중 최대값을 출력 
			      90 100 60
			      
			      출력:
			      최대값은 100입니다. */
				
				int n1= 60;
				int n2 = 90;
				int n3 = 100;
			
				if ((num1 > num2) &&(num1>num3)) {
					System.out.println("최대값은 "+ n1 + "입니다");
				} else if ((n2 > n1)&&(n2 >n3)) {
					System.out.println("최대값은 " + n2+ "입니다");
				} else {
					System.out.println("최대값은 " + n3 + "입니다");
				}
				System.out.println("=================");
				
			//위에 if문 간단하게 줄여보기
				int r1 = 60;
				int r2 = 90;
				int r3 = 100;
			
				if (r1>r2) {
					System.out.println("최대값은 60이다");
				} else if (r2>r3) {
					System.out.println("최대값은 90이다");
				} else {
					System.out.println("최대값은 100이다");
				}
				System.out.println("================="); 
				
			//삼항연산자 이용
				int w1 = 60;
				int w2 = 90;
				int w3 = 100;
				int Max;
				
				Max = ((w3>w2)&&(w3>w1)) ? w3 : w2;
				System.out.println(Max);
				
			
				
				
					
	}
		
		

}

	