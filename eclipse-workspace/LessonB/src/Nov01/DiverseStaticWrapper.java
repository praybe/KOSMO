package Nov01;

public class DiverseStaticWrapper {
	public static void main(String[] args) {

		// 클래스 메소드를 통한 인스턴스 생성 방법 두 가지
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1024"); //String으로 된 문자열을 숫자로 바꾸는 것.
		//db에서는 valueOf매우 자주 씀. 

		// 대소 비교와 합을 계산하는 클래스 메소드
		System.out.println("큰 수: " + Integer.max(n1, n2));
		System.out.println("작은 수: " + Integer.min(n1, n2));
		System.out.println("합: " + Integer.sum(n1, n2));
		System.out.println();
		
		//최대값 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// 정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		System.out.println("12의 16진 표현: " + Integer.toHexString(12));

	}

}
