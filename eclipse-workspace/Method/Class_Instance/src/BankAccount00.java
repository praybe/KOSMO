//클래스, 인스턴스 관련 예제


class BankAccount00 {	
	public static void printNum(int num) {
		System.out.println(num);
	}	
	
	public static void printBank(BankAccount acc) { //printBank에서 jung을 넘겼다는 말
		acc.checkMyBalance();
	}
	
		
	
	public static void main(String[] args) {	
		printNum(10);
			
		// 두 개의 인스턴스 생성
		BankAccount yu = new BankAccount();
		BankAccount jung = new BankAccount();
		
		
		yu.setName("유유유"); 
		jung.setName("정정정");
		
		
		 System.out.println(yu.getName());
		

		// @해시코드는 jvm이 제공하는 가짜 주소. 메모리 주소를 확인하는 방법
		System.out.println(yu);

		// 각 인스턴스를 대상으로 예금을 진행
		yu.deposit(5000);
		jung.deposit(3000);

		// 각 인스턴스를 대상으로 출금 진행
		yu.withdraw(2000);
		jung.withdraw(2000);

		// 각 인스턴스 대상 잔액 조회
		yu.checkMyBalance();
		jung.checkMyBalance();
			
		printBank(yu);
		
		
		//null 널 체크
		//가리키는 주소가 없다. 관계를 끊는다.
		yu = null;
		
		if (yu == null) {
			yu = new BankAccount();
		}else {
			yu.deposit(5000);
		}  
		
		
		
	
	
	}

}

