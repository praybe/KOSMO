//메소드 연습
//성적 수우미양가 
//무조건 암기~~ 

public class Grade {

	public static void main(String[] args) {

		char grade;
		double avg =30;

		grade = getGrade(avg);
		// 우 입니다. 로 출력
		System.out.println(grade + "입니다.");

	}

	public static char getGrade(double avg) { // 리턴타입 캐릭터 ! grade 구할거니까

		char grade; // 이걸 안써서 자꾸 오류뜸

		if (avg >= 90) {

			grade = '수'; // 내가 쓴 건 System.out.println("수"); 그래서 답이 어딘가 이상했음..

		} else if (avg >= 80) {

			grade = '우';
		} else if (avg >= 70) {

			grade = '미';
		} else if (avg >= 60) {

			grade = '양';

		} else {

			grade = '가';

		}

		return grade; //함수 앞에 void가 아닌 이상 return타입이 필요해

	}

}