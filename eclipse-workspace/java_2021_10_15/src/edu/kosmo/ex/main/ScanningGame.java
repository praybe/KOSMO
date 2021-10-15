package edu.kosmo.ex.main;

import java.util.Scanner;

class RockGame{
	private int 가위, 바위, 보;
	
	
	RockGame(int 가위, int 바위,int 보){
		this.가위 = 가위;
		this.바위 = 바위;
		this.보 = 보;
	}
	
	public String getRockGame() {
		String str;
		if(가위=가위) {
			
		}else if () {
			
		}
		
		return (Math.random() * 3 + 1);
	}
	
	
}

public class ScanningGame {
	public static void main(String[] args) {
				
		//Scanner로 받아보자
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");	
		String 가위 = sc.nextString();
		String 바위 = sc.String();
		String 보 = sc.String();
		
		System.out.println("계속하시겠습니까?(Y/N)");	
		int Y = sc.nextInt();
		int N = sc.nextInt();
		
		
		//객체 생성
		RockGame game = new RockGame(가위, 바위, 보);
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		System.out.println("비겼습니다.");
		System.out.println("이겼습니다.");
				
	}

}


