package edu.kosmo.ex.main;

import edu.kosmo.ex.market.Audio;
import edu.kosmo.ex.market.Buyer;
import edu.kosmo.ex.market.Computer;
import edu.kosmo.ex.market.TV;

public class MarketMain {
	public static void main(String[] args) {
		
		Buyer b = new Buyer(1000);
		//파라미터(괄호 안)이 다 다름. 120% PolyMorphism 사용했다는 의미.
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