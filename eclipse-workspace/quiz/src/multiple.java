package Inclass;

public class multiple {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 10000; i++) {
			if ((i % 5 == 0) && (i % 7 == 0)) {
				count++; // 5와 7의 배수면 count실행
			}
		}
		System.out.println(count + "개"); // 결과값 285 

//방법2 		
		int count1 = 0;
		for (int j = 1; j <= 10000; j++) {
			if ((j % 5 != 0) || (j % 7 != 0)) {
				continue; // 5의 배수가 아니면 그냥 continue, 7의 배수가 아니어도 continue
			}
			count1++; // 5와 7의 배수면 count실행
		}
		System.out.println(count1 + "개"); // 결과값 285 

	}

}
