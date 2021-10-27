package Oct27;
//챕터 18

import java.util.Scanner;

public class ExceptionJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println( num );
		
		System.out.println("Good bye ~~~");

	}

}

//숫자를 입력하면 Good bye가 나옴
//그런데 숫자가 아니라 문자를 입력하면?
//난리부르스 됨