//Oct19
package edu.kosmo.ex.vow;

public class ConsVowCount {

		private String word;
		private int consonant;
		private int vowel;
		
		public ConsVowCount (String word) {
			this.word = word;
			consonant = 0;
			vowel = 0;	
		}
		
		
		//밑에 countResult함수에 있어도 되는데 하나의 기능이라 따로 뻈음.
		//private은 내부적으로만 쓰는 거니까
		private void count(char ch) {
		
			//if else랑 switch 중 원하는 거 쓰셈
			
			switch (ch) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				vowel++;
				break; //걸리면 브레이크까지

			default:
				consonant ++;
				break;
			}
			
		}
		
		public void countResult() {
			//총글자수는 4개
			//자음:3 개
			//모음:1 개
			
			for (int i = 0; i<word.length(); i++) {
				char ch = word.charAt(i);
				count(ch);
			
			}
			
			System.out.println("총 글자 수는 " + word.length());
			System.out.println("모음 갯수는 " + vowel); //this.vowel로 써도 됨
			System.out.println("자음 갯수는 " + consonant);
			
			
		}
		
	

}
