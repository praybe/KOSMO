//Oct20
package edu.kosmo.ex.money;
/*
아래를 배열을 활용하여 프로그램을 짜시오.
화폐매수 구하기
- 1원 부터 5000 원 까지 랜덤으로 생성.
- 500원 100 원 50 원 10원은 배열로 선언 하여 저장 

해당 랜덤생성된 화폐 매수를 아래와 같이 출력
2860원 

출력
500원 : 5개 
100원 : 3개 
50원 : 1개 
10원 : 1개
*/

public class MoneyArr{
	private int money;
	//private int[] coin = new int[4];
	private int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};// 다이렉트로 초기화
	
	public MoneyArr(int money) {
		this.money = money;
		//coin[0] = 500;
		//coin[1] = 100;
		//coin[2] = 50;
		//coin[3] = 10;
		
	}
	
	public void show() {
		for(int i=0; i < coin.length; i++) {
			System.out.println(coin[i] + "원 " + money/coin[i] + "개"); //장 수를 일단 뺴 
			money =money % coin[i];
			
		}
		
	}
	
	




		
	

}
