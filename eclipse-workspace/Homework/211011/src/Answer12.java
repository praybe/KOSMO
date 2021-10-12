
public class Answer12 {

	public static void main(String[] args) {

		getSeason(3);
		getSeason(12);

	}

	public static void getSeason(int month) {

		switch (month) {
		case 3, 4, 5:

			System.out.println("봄 입니다.");

			break;
		case 6, 7, 8:

			System.out.println("여름 입니다.");

			break;
		case 9, 10, 11:

			System.out.println("가을 입니다.");

			break;
		case 12, 1, 2:

			System.out.println("겨울 입니다.");

			break;

		default:
			System.out.println("오류 입니다.");
			break;
		}

	}

}
