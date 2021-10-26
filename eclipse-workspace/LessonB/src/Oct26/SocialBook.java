package Oct26;
//오전수업
//16장
class UnivFriend {
	private String name, major, phone;

	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;

	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("전화: " + phone);
	}

}

class CompFriend {
	private String name, department, phone;

	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;

	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + department);
		System.out.println("전화: " + phone);
	}

}

public class SocialBook {
	public static void main(String[] args) {
		// 대학 동창 관리를 위한 배열과 변수
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;

		// 직장 동료 관리를 위한 배열과 변수
		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0;

		// 대학 동창의 정보 저장
		ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

		// 직장 동료의 정보 저장
		// 0번째 방
		cfrns[ccnt++] = new CompFriend("YOON", "R&D", "02-123-999");
		// 1번째 방, 후위연산이라 ccnt는 객체생성 후 배열에 집어 넣은 후 증가
		cfrns[ccnt++] = new CompFriend("PARK", "Sales", "02-321-777");

		// 모든 동창 및 동료의 정보 전체 출력
		// 0번쨰 1번째 방이라 ucnt는 2인 상황
		for (int i = 0; i < ucnt; i++) {
			ufrns[i].showInfo();
			System.out.println();
		}

		for (int i = 0; i < ccnt; i++) {
			cfrns[i].showInfo();
			System.out.println();
		}

	}

}
