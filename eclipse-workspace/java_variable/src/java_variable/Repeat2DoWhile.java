//반복문 do While구문 
public class Repeat2DoWhile {

	public static void main(String[] args) {
		
		/*do while은 반드시 안에 내용을 한번은 실행한다
		 * do while은 조건이 끝에 있어서 그렇다. 
		 * while은 조건에 맞지 않으면 내용 실행 안함*/
		
		int num = 0;
		do {
			System.out.println("I like Java" + num);
			num++;
		} while(num<5);

		
	}
}


/*코딩시 주의할 점 !!!!
 * while(num<5) { 이런식으로 while 뒤에는 ; 세미콜론을 넣으면 안된다.
 * ;은 문법 단위의 끝을 뜻함. 
 * 
 * do while에서는while(num<5); 이렇게 while 끝에 ; 세미콜론이 들어감.
 * 문법의 끝이기 때문이다. */
