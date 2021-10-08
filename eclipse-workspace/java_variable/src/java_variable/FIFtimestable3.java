//이중포문
//구구단 결과값이 홀수

public class FIFtimestable3 {

	public static void main(String[] args) {
		
		
		for (int i =1; i <=9; i++) {
			
			for(int j =1; j<= 9; j++) {
				int result = i*j;
				
				if(result %2==1) {
					System.out.println(i + "x" + j + "=" + (i * j));
				}
			}
			System.out.println();
		}
		
		
		
		/* 오답 ㅠㅠ 
		int i = 2;
		int j =1;
		int sum = i * j;
		
		for (i = 2; i <10 ; i++) {	
			if(sum % 2 ==0) {				
				continue;	
			}
										
			for(j = 1 ; j < 10 ; j++ ) {
				
				System.out.println(i + "x" +j+ "=" + sum );						
			}					
		} */
		
		


	}

}
