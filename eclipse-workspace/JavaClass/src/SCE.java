
public class SCE {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result; //boolean result = false;
		
		result = false && true;
		
		result = ((num1 += 10) < 0  && (num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = " +num2 + '\n');
		
		result = true && true;
		result = ((num1 +=10) >0 || (num2 += 10)>0);
		System.out.println("result = " + result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
//or연산 같은 경우 하나라도 true면 true로 연산됨. 그런데 앞에 데이터가 이미 true면 뒤에 데이터 계산 안해버림 ㅋㅋ
		
		
	}

}
