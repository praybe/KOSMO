package Oct27;

import java.util.InputMismatchException;
import java.util.Scanner;

//둘 이상의 예외 처리
public class ArithmeticExcJava {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.println("a/b ... a? ");
			int n1 = kb.nextInt();
			System.out.println("a/b ... b? ");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n2 / n2);
		}
		catch(ArithmeticException | InputMismatchException e) {
			e.getMessage();
		}
		System.out.println("GOOD BYE ! ");

	}

}
