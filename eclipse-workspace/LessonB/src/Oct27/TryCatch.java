package Oct27;
//Exception

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);


		   
			try {
				System.out.println("0 나누기 전");
				
				System.out.println(1/0);
				
				System.out.println("0 나누기 후");
				
			} catch(ArithmeticException ex) {
				System.out.println("ArithmeticException 에러입니다.");
				ex.printStackTrace();
				
			} catch(Exception e) {
				System.out.println("에러입니다.");
				//e.printStackTrace();
			}
		System.out.println("Good bye");

	}

}
