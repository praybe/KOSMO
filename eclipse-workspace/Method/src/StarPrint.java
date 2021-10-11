//메소드 연습
//6넣으면 6층탑

public class StarPrint {

	public static void main(String[] args) {

		starPrint(5); // 연산이 아니고 5개를 내부적으로 올리는거라 return값 불필요. 그러니 void사용
		starPrint(6);
		starPrint(3);
		starPrint(10);

	}

	public static void starPrint(int num) { // return type과 함수명을 입력

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
