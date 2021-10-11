
public class Num121 {

	public static void main(String[] args) {

	

		printGuGudan(12); // 겨울 입니다. 출력

	}

	public static void printGuGudan(int m) {

		switch (m) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");

			break;

		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");

			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다.");

			break;

		case 12:
		case 1:
		case 2:
			System.out.println("겨울 입니다.");

			break;

		default:
			break;
		}

	}
}


//결과값: 겨울 입니다.
