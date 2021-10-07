//후위 연산자
public class PostfixOp {

	public static void main(String[] args) {

		
		int num=5;
		System.out.print((num++) + ""); //출력 후 값 증가. (num)찍힌 뒤에 ++ 연산 됨. 그래서 그 다음번에 (num)찍으라 하면 그제서야 연산된 결과값이 보임.  
		System.out.print((num++) + ""); //출력 후 값 증가
		System.out.print(num + "\n");
		
		System.out.print((num--) + ""); //출력 후 값 감소
		System.out.print((num--) + ""); //출력 후 값 감소
		System.out.print(num);
	//print와 println 다름. print는 횡으로 찍히고 println은 열로 찍힘. 		
		System.out.println("\n");
		
//전위 연산자와 후위 연산자 구분 //		
	//전위 연산자
		int num1 = 2;  //num1 = num1 +1 을 먼저 연산 후 출력
		System.out.println(++num1);
		System.out.println(num1);
		System.out.println("=========");
	// 후위연산자
		int num2 = 2; // 출력 후 num = num+1 연산
		System.out.println(num2++);
		//System.out.println(num2)출력 후 num2= num2+1 여기에서 연산 진행;
		System.out.println(num2);
		
	
	}

}
