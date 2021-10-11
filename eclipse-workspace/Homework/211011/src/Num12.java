
public class Num12 {

	public static void main(String[] args) {

	

		getSeason(3); // 봄입니다. 출력

	}

	public static void getSeason(int m) {

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


//결과값: 봄 입니다.

