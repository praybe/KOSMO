package Oct18;
import java.util.Scanner;

//ABCD 입력 하게 되면
//DCBA 출력
public class CharAt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String word = sc.next();

		
		for(int i = word.length() -1; i>=0; i--  ) {
			System.out.print(word.charAt(i));
			
			
		}
		//랭스는 네개면 네개 다 나오고 인덱스는 다름.
		
		

	}

}
