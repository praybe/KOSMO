package Inclass;

public class seasons {

	public static void main(String[] args) {

		int n = 3;
		switch (n) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("봄입니다.");

			break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("겨울입니다.");
			break;

		default:
			System.out.println("찾을 수 없습니다.");
			break;
		}

	}

}
