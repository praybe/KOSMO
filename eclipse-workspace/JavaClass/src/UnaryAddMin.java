
public class UnaryAddMin {

	public static void main(String[] args) {
		short num1 =5;
		System.out.println(+num1); //결과적으로 불필요한 + 연산
		System.out.println(-num1); //부호를 바꿔서 얻은 결과를 출력
		
		short num2 = 7;
		short num3 = (short)(+num2); // 형 변환 하지 않으면 오류 발생
		short num4 = (short)(-num2);  //형 변환 하지 않으면 오류 발생
		System.out.println(num3);
		System.out.println(num4);
		
		
		short num5 =10;
		short num6 = num5;
		/*short num7 = +num5; //고작 +붙였다고 에러가 남. */
		short num8 = (short)+num5;
		
		

	}

}
