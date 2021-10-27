package Oct27;

interface Sea {}// 마커 인터페이스
interface Ground {}// 마커 인터페이스

interface Serializable {
	// 고슬링 아재가 만든 대표적인 마크인터페이스
	// f3치고 들어가면 고슬링아재ver 설명충 등장
}

interface Location {
	void printLive();
}

class Fish implements Location, Sea {
	@Override
	public void printLive() {
		System.out.println("바다에 삽니다.");
	}

}

class Tiger implements Location, Ground {
	@Override
	public void printLive() {
		System.out.println("육지에 삽니다.");
	}

}

public class MarkInterface {
	// 메인이 포함된 해당 클래스에다가 함수 만들라하면
	// static 붙여서 만들어야함. 
	// 왜냐 static붙은 메인함수에서 뽑아내서 다시 함수 만드는거니까
	public static void printLocation(Location loc) {
		if (loc instanceof Sea) {
			System.out.println("바다에 삽니다.");
		} else if (loc instanceof Ground) {
			System.out.println("육지에 삽니다.");
		} else {
			System.out.println("외계생물입니다.");
		}
	}

	public static void main(String[] args) {
		Location loc1 = new Fish();
		Location loc2 = new Tiger();

		printLocation(loc1);
		printLocation(loc2);

	}

}
