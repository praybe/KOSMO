
public class EscapeSequences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C');
		System.out.println("AB" + '\t' + 'C');
		System.out.println("AB" + '\n' + 'C');
		System.out.println("AB" + '\r' + 'C');
		
		char ch = 65;
		System.out.println(ch + "\'Hello\'");
		
		
		int num1 = 100;
		long num2 = 3100000000L; 
		//컴퓨터는 무식해서 반드시 연산시 두 개의 형을 일치시킨다.
		//언제? 연산시 두 개의 타입이 다를 겨우
		
		long result = num1 + num2;
		System.out.println(result);
		
		
		float num3 = 1.12f;
		//System.out.println(l);
		
		double pi = 3.14;
		int num4 = (int)pi;
		System.out.println(num1);
		
		/*
		long 1 = 3100000000L;  //큰 걸 자를땐 위험을 감수하고 해야함
		num5 = (int)num5 ; 
		*/
		
		
		
	}

}
