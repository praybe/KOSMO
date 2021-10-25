package Oct22_java56;
/*문제 5의 갬블링 게임을 n명이 하도록 수정하라.
실행 예시와 같이 게임에 참여하는 선수의 수를 입력 받고 각 선수의 이름을 
입력 받도록 수정하라.

겜블링 게임에 참여할 선수 숫자>>3  배열로 3개 
1번째 선수 이름>>황
2번째 선수 이름>>이
3번째 선수 이름>>김*/
import java.util.Scanner;

//패키지 다르면 사용 import Oct22_Sub.GamblePerson;


public class GamblingMainMany {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("플레이어 수 입력");
		int num = sc.nextInt(); //이걸 생각 못함
			
		//겜블링 게임에 참여할 선수 숫자>>3  배열로 3개 
		GamblePerson[] user = new GamblePerson[num]; 
		//배열하면 반드시 120프로 for문 들어감.
		for(int i =0; i < user.length; i++) {
			System.out.println( (i+1) + "번쨰 플레이어>>"); //i가 0부터 넘어오니까 i+1
			String name = sc.next(); //name 받고
			user[i] = new GamblePerson(name); //i번쨰 0번쨰에다가 집어 넣고 
			
		}
		
		String buffer = sc.nextLine(); // 버퍼 넣어서 싹 정리
		
		
		while(true) {
			for(int i = 0; i < user.length; i++) {
				
			System.out.print("[" + user[i].getName() + "]:"); 
			
			//엔터 받아 내기 위한 입력 
			buffer = sc.nextLine();
			
			if(user[i].game()) {
				System.out.println("[" + user[i].getName() + "]:" + "님이 이겼습니다."); 
				 
				//break;하면 for문에서 빠져나가서 다시 돌아가. 그러면서 while 문 돌면서 다시 for문 들어가. 
				//그러니 return해서 게임 종료. return은 main에 대한 return
				return; 
			}
			System.out.println("아쉽군요"); 
	
			}
		}
	}

}
