// 3장 상수: 변하지 않는 수, 변수 앞에 파이너리

package java_variable;

public class Constants {

	public static void main(String[] args) {
		final int num = 100; //변수명 앞에 final 붙이면 에러남
		num = 500;
		
		final int MAX_SIZE = 100;
		
		final char CONST_CHAR = '상';
		
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;
		

	}

}
