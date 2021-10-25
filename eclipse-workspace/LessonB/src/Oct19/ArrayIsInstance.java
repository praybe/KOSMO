package Oct19;

public class ArrayIsInstance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//길이가 5인 int형 1차원 배열의 생성
		int[] ar1 = new int[5];
		
		//길이가 7인 double형 1차원 배열의 생성
		double[] ar2 = new double[7];
		
		//배열의 참조변수와 인스턴스 생성 분리
		float[] ar3;
		ar3 = new float [9];
		

		//배열의 인스턴스 변수 접근
		System.out.println("배열ar1 길이: " + ar1.length);  // <<배열은 함수가 아님!! 변수 명 그대로!!!
		System.out.println("배열ar2 길이: " + ar2.length);
		System.out.println("배열ar3 길이: " + ar3.length);
		
		/* cf
		String str = "1234"
		System.out.println("배열ar1 길이: " + str.length()); // << 얘는 함수로 ~! 
		*/
		
		/*클래스도 배열로 만들 수 있다.
		class Box{ }
		Box[] ar = new Box[5];
		 */
		
		
		

	}

}
