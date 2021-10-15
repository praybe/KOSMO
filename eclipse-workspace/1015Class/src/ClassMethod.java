
class NumberPrinter{
	private int myNum = 0;
	
	
	//보통 static변수를 다루기 위해 static함수를 만든다.
	static int staticNum = 0;
	
	//static 함수에 인스턴스 라면(변수는 스프,함수는 면)이 올 수 없는 이유
	//인스턴스 변수, 함수는 메모리에 객체 생성 될 떄 올라간다.
	//static 객체도 생성 되기 전에 올라감.
	//결론: static과 인스턴스 메모리 생성에 시간 차가 나기 떄문.
	static void showInt(int n) {		
		System.out.println(myNum);		
	}
	
	void setMyNumber(int n) {
		myNum = n;
	}
	
	//인스턴스 함수의 static이 올 수 있는 이유: stactic이 먼저 올라가 있어서
	void showMyNumber() {
		showInt(myNum);
		
	}
	
}


public class ClassMethod {

	public static void main(String[] args) {
		
		System.out.println(); //static이 선언됨. 자주 쓰기 때문
		
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		

	}

}











