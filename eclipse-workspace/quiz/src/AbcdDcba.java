import java.util.Scanner;

public class AbcdDcba {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("문자를 입력하시오.");
		
		String word = sc.next();
		
		for ( int i = word.length() -1 ; i >=0 ; i --  ) {
			System.out.print(word.charAt(i));
			
		}


	}

}
