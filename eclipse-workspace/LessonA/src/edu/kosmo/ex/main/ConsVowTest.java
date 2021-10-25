//Oct19

package edu.kosmo.ex.main;

import java.util.Scanner;

import edu.kosmo.ex.vow.ConsVowCount;

/*
8.사용자로부터 받은 문자열(영문으로)에서 자음과 모음 개수를 계산하는 프로그램을 작성

입력:abcd 

출력:
총글자수는 4개
자음:3 개
모음:1 개 */
//힌트: sc.next와 charAt 활용할 것.
public class ConsVowTest {

	public static void main(String[] args) {
		
		while(true) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오.");
		
		String word = sc.next();
		
		            //객체명 
		ConsVowCount cons = new ConsVowCount(word);
		cons.countResult();
		
		//System.out.println( "계속 Y :: 중단 N");
		
		//char ch = sc.next().charAt(0); //한 번 더 입력받고 0번쨰
		
		//if( ch == 'N' || ch == 'n' ) 
		//	break;
		
		System.out.println( "계속 Yes :: 중단 No");
		
		 String YesOrNo = sc.next();
		 
		 if(YesOrNo.equals("yes") || YesOrNo.equals("Yes")) // 문자열 비교는 반드시 equals 사용
			 continue;
		 else
			 break;
		
		}
		System.out.println("종료합니다.");


	}

}
