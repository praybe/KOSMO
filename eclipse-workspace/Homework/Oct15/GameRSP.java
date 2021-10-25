package Oct15;
//박소은님거 긁어옴 ..ㅎ
import java.util.Scanner;


class Player{
	private int rsp; // 1.가위    2.바위   3.보
	
	public Player(String rsp) {
		if(rsp.equals("가위")) {
			this.rsp = 1;
		}
		else if(rsp.equals("바위")) {
			this.rsp = 2;
		}
		else {
			this.rsp = 3;
		}
	}
	
	
	public Player() {
		this.rsp = (int)(Math.random()*3 + 1);
				
	}
	
	
	private String getRSPString(int rsp) {
	     String str;
	    
	     if(rsp == 1)
	     str = "가위";
	     else if(rsp ==2)
	     str = "바위";
	     else
	     str = "보";
	    
	     return str;
	    }
		
	
	public void result(Player player) {
		
		System.out.println("나는:" +  getRSPString(this.rsp) + " 당신은:" + getRSPString(player.rsp));
		
		if(this.rsp == player.rsp) {
			System.out.println("비겼습니다.");
			return;
		}
		if(this.rsp == 1 && player.rsp == 2) {
			System.out.println("제가 졌습니다.");
		}
		else if(this.rsp == 1 && player.rsp == 3) {
			System.out.println("제가 이겼습니다.");
		}
		else if(this.rsp == 2 && player.rsp == 1) {
			System.out.println("제가 이겼습니다.");
		}
		else if(this.rsp == 2 && player.rsp == 3) {
			System.out.println("제가 졌습니다.");
		}
		else if(this.rsp == 3 && player.rsp == 1) {
			System.out.println("제가 졌습니다.");
		}
		else if(this.rsp == 3 && player.rsp == 2) {
			System.out.println("제가 이겼습니다.");
		}
		
	}
	
	
}


public class GameRSP {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("가위 바위 보를 입력하세요.");
			String rsp = sc.next();
			
			Player you = new Player(rsp);
			Player com = new Player();
			
			com.result(you);
			
			System.out.println("계속 : Y   /  중단 : N");
			char ch = sc.next().charAt(0);
			
			if(ch == 'N' || ch == 'n') {
				break;
			}		
		}
		
		System.out.println("게임 종료 입니다.");
		
	}

}