package Oct19;
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
class MoneyArr {
	
	private int currency;
	private int[] money = new int[4];
	
	public MoneyArr(int currency) {
		this.currency = currency;
		money[0] = 500;
		money[1] = 100;
		money[2] = 50;
		money[3] = 10;
	}
	
	public void show() {
		for(int i =0; i< money.length; i++) {
		System.out.println(money[i] + "원" + " : "+ currency / money[i]  + "개");
		currency = currency % money[i];			
		}
	}

	
}


public class MoneyRandom {
	public static void main(String[] args) {
		
		int money = 2860;
		
		MoneyArr moneyArr = new MoneyArr(money); //MoneyArr 객체생성
		moneyArr.show();
		
		

	}
}
