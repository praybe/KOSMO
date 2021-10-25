package Oct22;
//첫번째 배운거
class MobilePhone {
	protected String number; // 전화번호

	public MobilePhone(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer; // 안드로이드 운영체제 네임(버전)

	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}

}

public class PolyMorphism {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");

		ph1.answer(); // 전화를 받는다.
		ph1.playApp(); // 앱을 선택하고 실행한다.
		System.out.println();
		
		
		//다형성
		//부모
		int a = 100; //32비트
		double num =a ; //64비트 자동형변환
		
		//레퍼런스 타입에도 법칙이 있음.
		//왼쪽 부모              오른쪽 자식
		//부모 = 자식. (feat. 형변환없이)(다형성)
		//자동형변환 없이 되더라. 원래대로라면 MobilePhone ph2 = (SmartPhone)new SmartPhone(); 요래됨
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		ph2.answer(); // ph2.playApp();이건 컴파일 에러가 남

	}

}
