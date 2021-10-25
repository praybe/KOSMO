package Oct22_java56;
/*6번.
 두 사람이 게임을 진행한다. 
이들의 이름을 키보드로 입력 받으며 
각 사람은 Person 클래스로 작성하라. 
그러므로 프로그램에는 2개의 Person 객체가 생성되어야 한다.

 두 사람은 번갈아 가면서 게임을 진행하는데 
각 사람이 자기 차례에서 <Enter> 키를 입력하면, 
3개의 난수가 발생되고 이 숫자가 모두 같으면 승자가 되고 
게임이 끝난다.
 난수의 범위를 너무 크게 잡으면 3개의 숫자가 
일치하게 나올 가능성이 적기 때문에 숫자의 범위는 
1~3까지로 한다.*/

/*7번
 문제 6의 갬블링 게임을 n명이 하도록 수정하라.
실행 예시와 같이 게임에 참여하는 선수의 수를 입력 받고 각 선수의 이름을 
입력 받도록 수정하라.

겜블링 게임에 참여할 선수 숫자>>3
1번째 선수 이름>>황
2번째 선수 이름>>이
3번째 선수 이름>>김*/
public class GamblePerson {
	
	
	//데이터 멤버 반드시 정하고
	//데이터 멤버 컴트롤 할 함수 정해
	//pesron에 new 두 명 
	private String name;
	private int num1, num2, num3; //수희가 가진 3개의 숫자
	//private int 수희, 연수;
	
	
	
	
	public GamblePerson (String name){
		this.name = name;
	} 
	
	/*public Person(int 수희, int 연수) {
		this.수희 = 수희;
		this.연수 = 연수;
	}*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//랜덤으로 떄려 넣고 num123 비교해서 같은지 안 같은지 리턴하는 함수 만들기
	public boolean game() {
		
		//전체가 int로 형변환
		//랜덤 3개 +1
		num1 =(int)(Math.random()*3+1); 
		num2 =(int)(Math.random()*3+1); 
		num3 =(int)(Math.random()*3+1); 
		
		System.out.print("\t" +num1 +" " + num2 +" " + num3 );
		//3개 같은거 표현은 반. 드. 시 아래와 같이
		//(num1 == num2 == num3) 이러면 안됨 ㅋㅋㅋㅋㅋ 컴파일 에러남
		if(num1 == num2 && num2 == num3) {
			return true;
		}
		return false;
		
	}

/* 내가 엉망으로 .. 날밤새며 만든 코드... 그리고 제대로 들림 ㅎㅎㅎ 
	public String toString() {
		String str ; 
	 	if (수희 == 수희) {
			str = "이겼습니다.";
		}else if (수희 != 수희) {
			str = "꽝";
		}else if (연수 == 연수) {
			str = "이겼습니다.";
		}else{
			str= "꽝";
		};
		
		return str;*/
		

				
		
	
	
}
