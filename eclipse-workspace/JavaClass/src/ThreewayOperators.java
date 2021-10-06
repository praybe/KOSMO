//삼항연산자 ( if ? : )

public class ThreewayOperators {

	public static void main(String[] args) {

		int num1;
		int num2 = 100;
		int num3 = 10;
		
		num1 = (num2>num3) ? num2 : num3 ;  // 이게 문법임 ㅋㅋ
			//   항1          항2     항3
		/*물음표 앞에 조건절이 옴. if와 같음. 그러니 true false가 됨
		 * 만약 true면 num2값이 나오고 false면 num3값이 넘어 옴*/
		System.out.println(num1);
		
		
		num1 = (num2<num3) ? num2 : num3 ;
		System.out.println(num1);
		
		
		num1 = (num2>num3) ? (num2-num3) : (num3-num2) ;
		System.out.println(num1);
		
		
		num1 = (num2<num3) ? (num2-num3) : (num3-num2) ;
		System.out.println(num1);
		
		
		
	}
}

