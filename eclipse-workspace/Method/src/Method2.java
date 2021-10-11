//1. 함수 만드는 것(정의) 2.함수 써먹는 법(호출)
public class Method2 {

	public static void main(String[] args) {

		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();

	}

	public static void hiEveryone(int age, double height) { //파라미터 여러 개 올 수 있음

		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");

	}

	public static void byEveryone() { //파라미터(매개변수)가 없어~

		System.out.println("다음에 뵙겠습니다.");

	}

}

//함수라는 것은 기본적으로 '기능'을 뜻함
//byEveryone이라는 기능은 "다음에 뵙겠다"라는 문구를 담은 기능이고
//hiEveryone은 키를 출력하는 기능 단위
// 함수 is the 기능//public static은 함수 아님