
public class Num09 {

	public static void main(String[] args) {

		printGuGudan(3); // 3단 출력
		printGuGudan(4);

	}

	public static void printGuGudan(int num) {

		for (int i = num; i <= num; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.println(num + "x" + j + "= " + num * j);

			}
		}
		System.out.println();

	}

}

/*
 * 결과값 3x1= 3 3x2= 6 3x3= 9 3x4= 12 3x5= 15 3x6= 18 3x7= 21 3x8= 24 3x9= 27
 * 
 * 4x1= 4 4x2= 8 4x3= 12 4x4= 16 4x5= 20 4x6= 24 4x7= 28 4x8= 32 4x9= 36
 */