//Switch구문 응용. 
public class SwitchBreak {

	public static void main(String[] args) {
		/* 달(1월달, 2월달 ..)을 담는 변수 선언
		1, 2, 3, 4 봄입니다 출력
		5, 6, 7, 8 여름입니다
		9, 10, 11, 12 겨울입니다 출력 
		1~12가 아닌 경우는 잘못된 입력입니다 */
		
			int month=1;
			switch (month) {
			case 1:
				System.out.println("1, 2, 3, 4 봄입니다");
			case 2:
				System.out.println("5, 6, 7, 8 여름입니다");
			case 3:
				System.out.println("9, 10, 11, 12 겨울입니다");		
				break;
	
			default: System.out.println();
				break;
			}
			System.out.println("======================");
		//선생님 해설
			int m = 9; //넣는 숫자에 따라서 나오는 값이 달라짐.
			
			switch (m) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("봄입니다.");
				break;
			case 5:case 6:case 7:case 8:
				System.out.println("여름입니다.");
				break;
			case 9, 10, 11, 12: //최신문법이라 아직 실무에서는 잘 안씀
				System.out.println("겨울입니다.");
				break;
				

			default:
				System.out.println("잘못된 입력입니다.");
				break; //이 때는 break 있어도 좋고 없어도 좋음
			}
			
			System.out.println("======================");
			
		

	
			

	}
}
