
public class Oct6thAnswer {

	public static void main(String[] args) {
		
//과제 10번 해설. 세 수 중 큰 수 찾기
			int a = 60;
			int b = 90;
			int c = 100;
			
			int max; //최대값 설정
		
			if (a>b) {
				if(a>c) {      //if 문 안에 if 있는건 그다지 좋지 않음
					max=a;
				}else {
					max = c;
				}
			}else {
				if(b>c) {
					max=b;
				}else {
					max=c;
				}
			}
			System.out.println(max);			
			System.out.println("=============");
	
		//방법 2. 내가 한 방법. 
			if((a>b)&&(a>c)) {
				max = a;
			}else if((b>a)&&b>c) {
				max=b;
			}else {
				max=c;
			}
			System.out.println(max);
			System.out.println("=============");
			
		//방법 3. 좀 더 줄여보기. 선생님 방법.
			max = a; //a를 max값으로 지정해놓고 b와 비교
			if(b>max) {
				max=b;
			}
			if (c>max) {
				max = c;
			}
			System.out.println(max);
			System.out.println("=============");
			
		//삼항연산자 이용
			//a와 b를 일단 비교를 해. a가 더 크면 참
			max = (a>b) ? (a>c?a:c) : (b>c? b:c); 
			System.out.println(max);
			
			System.out.println("=============");

	}

}
