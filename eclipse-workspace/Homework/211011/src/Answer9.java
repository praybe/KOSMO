
public class Answer9 {

	public static void main(String[] args) {

		printGuGudan(3);
		printGuGudan(4);

	}

	public static void printGuGudan(int dan) {

		for (int j = 1; j <= 9; j++) {

			System.out.println(dan + "x" + j + "= " + (dan * j));

		}

		System.out.println();

	}

}
