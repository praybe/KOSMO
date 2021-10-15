package a;

public class A {
	
	//인스턴스 변수에 대해서는 무조건 private
	private int a; 
	
	void printA() {
		System.out.println("A 클래스 입니다.");
		System.out.println("" + a);
	}
	private void printB() {
		printA();
	}


	

}