//메소드 연습
//반드시 암기 !!!!

public class MethodAdd {

	public static void main(String[] args) {

		int num = add(3, 7); // 호출하는 중. 그러려면 함수가 있어야 함
		System.out.println(num);

	}

	// 호랑이는 죽으면 가죽을 남기고, 함수는 죽으면 값을 남긴다.
	// 그것이 바로 리턴이다.
	// void로 하면 값도 안 남김..ㅎㅎ

	public static int add(int num1, int num2) { // 3과 7을 메모리에 올릴 수 있는 변수 선언을 반드시 해야 함

		// 함수 명 앞에 있는 리턴타입을 결정해줘야 함.
		// add라는 함수는 값을 넘겨주고 있음.그러려면 반드시 return이 있어야 함
		// return이 있으려면 return타입도 있어야함. 반드시
		int result = num1 + num2;
		return result; // 결과에 대한 int를 맞춰 줘. 혹은 바로 return num1 + num2; 도 가능

	}

}
