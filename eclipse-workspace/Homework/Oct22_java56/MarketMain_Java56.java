package Oct22_java56;
//5번

//패키지 다르면 이동 시켜줘 import Oct22_java56.Audio; 
public class MarketMain_Java56 {
	public static void main(String[] args) {
		
		Buyer b = new Buyer(1000);
		b.buy(new TV());
		b.buy(new Computer());
		b.buy(new TV());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
			
		b.summary();
		

	}

}

//잔액이 부족하여 Computer를 살 수 없습니다.
//구입한 물건: 티비, 컴, 티비, 오디오, 컴, 컴
//시용금액: 850
//남은금액: 150