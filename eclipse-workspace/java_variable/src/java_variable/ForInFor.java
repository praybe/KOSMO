//이중포문(반복문의 중첩형태)

public class ForInFor {

	public static void main(String[] args) {
		// i = 1
		for (int i = 0; i < 3; i++) { // 바깥쪽 for문

			System.out.println("---------------------");
			// j = 2
			for (int j = 0; j < 3; j++) { // 안쪽 for문

				System.out.println("[" + i + "," + j + "]");
				// [0, 0] [0, 1] [0, 2]
				// ---------------------
				//

			}

			System.out.println('\n');
		}

	}

}
