package classwork; //

public class Oct11thAnswer  {

	public static void main(String[] args) {
		
		
		//126_000 원
		
		//126_000 / 50_000 =2 장 (5만원짜리 2장을 메모리에 우선 저장
		
		//126_000 - (50_000*2) = 26_000 원
		
		// 26_000 / 10_000 = 2장
		
		// 26_000 - (10_000*2) = 6_000원
		
		
		
			//5만원   만원   5천원  천원  500원 백원  돈 담는거
		int m_500, m_100, m_50, m_10, m_5, m_1, tmp;
		
		int money = 126_000;
		
		m_500 = money / 50000; // 머니에서 5만원 나눠
		tmp = money - (m_500 * 50000); // (장수 * 5만원)
		
		m_100 = tmp / 10000;                //tmp넣는 곳에 money넣으면 장수 차이 남 
		tmp = tmp - (m_100 * 10000);
		
		m_50 = tmp / 5000;
		tmp = tmp - (m_50 * 5000);
		
		m_10 = tmp / 1000;
		tmp = tmp - (m_10 * 1000);
		
		m_5 = tmp / 500;
		tmp = tmp - (m_5 * 500);
		
		m_1 = tmp / 100;
		tmp = tmp - (m_1 * 100);
		
		
		System.out.println("오만원 : " + m_500 + "장");
		
		System.out.println("만원 : " + m_100 + "장");
		
		System.out.println("오천원 : " + m_50 + "장");
		
		System.out.println("천원 : " + m_10 + "장");
		
		System.out.println("오백원 : " + m_5 + "장");
		
		System.out.println("백원 : " + m_1 + "장");
		
		System.out.println('\n');
		
		
		
		
	//두 번째 방법 (좀 더 간략하게)
		//money = 126_500;
		
		System.out.println("오만원 : " + money / 50000 + "장");
		money = money % 50000; //126500을 50000으로 나눈 떨거지
		
		System.out.println("만원 : " + money / 10000 + "장");
		money = money % 10000;
		
		System.out.println("오천원 : " + money / 5000 + "장");
		money = money % 5000;
		
		System.out.println("천원 : " + money / 1000 + "장");
		money = money % 1000;
		
		
		System.out.println("오백원 : " + money / 500 + "장");
		money = money % 500;
		
		System.out.println("백원 : " + money / 100 + "장");
		money = money % 100;
		
		
		
		
		
		
		
		



	}

}
