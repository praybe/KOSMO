//참조변수 관련 예제

class DupRef {
	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount(); // 메모리 그림 그리는 그 상황
		BankAccount ref2 = ref1;

		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();

	}

}

//결과값 
//잔액 : 4300
//잔액 : 4300

//이해하는 방법: 메모리 