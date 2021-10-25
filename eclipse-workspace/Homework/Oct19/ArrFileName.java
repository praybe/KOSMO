package Oct19;

import java.util.Scanner;

/*
 아래를 프로그래밍 하시오.
"Hello.java" 문자열에서 파일명과 확장자인 java를 분리시키는 프로그램을 짜시오.

입력: Hello.java
출력: 파일이름은: Hello 이며 확장자는 java 입니다.

입력: Java.avi
출력: 파일 이름은: Java 이며 확장자는 avi 입니다.
 */

public class ArrFileName {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("OOO.java를 입력하세요." + "\n" + "(OOO에는 어떠한 단어도 가능합니다.)");
		String word = sc.next();
		
		
		//Hello.java 헬로우 뽑아내고 자바 뽑아내고 
		//substring(0, 5);
		//substing(점 +1, word.length());
		
		int dot = 0; //점 위치 지정
		for(int i = 0; i< word.length(); i++) {
			if(word.charAt(i) == '.') {  //charAt은 문자를 리턴. 문자열이 아니고 문자인듯?
				dot = i;
			}
		}
		
		int index = word.indexOf('.');
		System.out.println(index);
		System.out.println(dot);
		
		//String fileName = word.substring(0, index);
		//String extention = word.substring(index+1, word.length());
		
		String fileName = word.substring(0, dot);
		String extention = word.substring(dot+1, word.length());
		
		System.out.println(fileName);
		System.out.println(extention);
		

	}

}





