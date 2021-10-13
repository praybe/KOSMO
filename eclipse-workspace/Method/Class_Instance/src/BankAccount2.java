//클래스, 인스턴스 관련 예제




class BankAccount2 {	
	
	public static void main(String[] args) {
		
		//생성장 (Constructor) new 뒷 부분
		//1.클래스 이름 같은 함수 = 생성자
		//2.만약 개발자가 생성자를 만들지 않으면
		//컴파일러 만들어주는 생성자 이걸 디폴트 생성자라고 함
		//3.생성자 또한 함수 이지만 기존 함수와 조금 다르다.
		// 다른 점은 리턴 타입이 없으니까 당연히 리턴 값도 없다.
		BankAccount yu = 
				new BankAccount("12-34-89", "990990-9090990", 10000); //계좌생성
		yu.initAccount("12-34-89", "990990-9090990", 10000); //초기화
		
		BankAccount jung = 
				new BankAccount("12-34-78", "999999-399998", 10000);
		jung.initAccount("12-34-78", "999999-399998", 10000);
		
		
		//이미 다른 생성자를 만들어서 디폴트 생성자를 안 만들어 zoom
		BankAccount choi= 
				new BankAccount();
		
		
	}

}

