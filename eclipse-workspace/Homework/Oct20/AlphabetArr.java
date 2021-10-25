package Oct20;
//8번
/*
 char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력 해보자. 
알파벳은 26개.
*/


public class AlphabetArr {

		public static void main(String[] args) {
			char[] ca = new char[26];
			
			for(int i=0; i<ca.length; i++) {
				
				ca[i] =  (char)('A'+ i);
			}
			for(char e : ca) {
				System.out.print(e + " ");
			}
		}
	}


