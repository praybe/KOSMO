package Nov04;

import java.util.Scanner;
import java.util.StringTokenizer;

class TokensCount {
	public void run() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("문장을 입력하세요.");

			try {
				String words = sc.nextLine();
				// 한구절 전체를 읽으려면 nextLine

				if (words.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}
				// words를 받으면 StringTokenizer 사용
				StringTokenizer tokens = new StringTokenizer(words, " ");

				System.out.println("어절 수: " + tokens.countTokens());

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("잘못된 입력이니 다시 입력하세요.");
				continue;
				// sc.nextLine(); 버퍼로 비워주고

			}
		}

	}
}

public class Wordsegment2 {
	public static void main(String[] args) {

		TokensCount tc = new TokensCount();
		tc.run();

	}
}
