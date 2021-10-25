package Oct18;
//모르겠으면 그냥 암기하시오.

import java.util.Scanner;

class Player {   //한 화면에 public class가 두 개일 수는 없음.
	// 1번 가위, 2번 바위, 3번 보
	private int rsp;
	// private String rsp;로 문자로 담아도 됨.

	// 샘성자를 만든다.
	public Player(String rsp) {
		// rsp == "가위" 자바 용어에서는 이거 안됨. 많이 실수 하는 것.
		if (rsp.equals("가위"))
			this.rsp = 1;
		else if (rsp.equals("바위"))
			this.rsp = 2;
		else
			this.rsp = 3;

	}

	public Player() {
		this.rsp = (int) (Math.random() * 3 + 1); // 랜덤함수(난수), *3 +1 means 1부터 3까지
	}
	
	private String getRSPString(int rsp) {
		String str = "";

		if (rsp == 1)
			str = "가위";
		else if (rsp == 2)
			str = "바위";
		else
			str = "보";

		return str;
	}

	public void result(Player player) {
		
		System.out.println("나는:" +  getRSPString(this.rsp) + " 당신은:" + getRSPString(player.rsp));

		if (this.rsp == player.rsp) {
			System.out.println("비겼습니다.");
			return;
		}

		// 1.가위 2.바위 3.보
		if (this.rsp == 1 && player.rsp == 2) {
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 1 && player.rsp == 3) {
			System.out.println("제가 이겼습니다.");
		} else if (this.rsp == 2 && player.rsp == 1) {
			System.out.println("제가 이겼습니다.");
		} else if (this.rsp == 2 && player.rsp == 3) {
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 3 && player.rsp == 1) {
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 3 && player.rsp == 2) {
			System.out.println("제가 이겼습니다");
		}

	}



}

public class RSPTest {
	public static void main(String[] args) {
		
		while (true) {

		Scanner sc = new Scanner(System.in);

		System.out.println("가위 바위 보를 입력하세요.");
		String rsp = sc.next();

		// 플레이어 you를 생성자로 받는다. 생성자로 받아야 가위바위보를 어쩌고 할 수 있다.
		// 컴퓨터는 따로 입력 할 필요가 없음.
		Player you = new Player(rsp);
		Player com = new Player();

		com.result(you);
		
		//탈출조건
		System.out.println("게속 Y ::중단 N");
		char ch = sc.next().charAt(0); //문자열을 받는데 첫번쨰만
		
		if(ch == 'N' || ch =='n')
			break;
	
		}
		System.out.println("게임 종료 입니다.");

	}
		
		

}
