package Oct19;

class A{
	
	void a(){
		String s1 = "AAa";
		
		for(int i = 0; i < 50000; i++) {
			s1 =s1 + "BBB" +19;
			
		}
	}
		
	
}


public class CompString {
	public static void main(String[] args) {
		
		             //동시접속자 5만명이라고 생각하자
		for(int i = 0; i < 50000; i ++ ) {
			A a = new A();
			a.a();

		}
		

	}
}
