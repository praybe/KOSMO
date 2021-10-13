//클래스, 인스턴스 관련 예제

class BankAccount {
	
	
	String accNumber; //계좌번호
	String ssNumber; //주민번호
	
	String name;
	
	int balance = 0; // 예금 잔액
	BankAccount(){
		System.out.println("생성자 호출");
		
	}
	
	//생성자 함수 만들 때 파라미터 넘길 수 있음
	BankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
		
	//초기화를 위한 메소드
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal; //계좌 개설 시 예금액으로 초기화
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {		
		this.name=name;
	}
	
	


}
