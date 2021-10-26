package Oct26;
//오전수업
//16장
class Friend {

	private String name, phone;

	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);

	}

}

class UniFriend extends Friend {
	private String major;

	public UniFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("전공: " + major);
	}

}

class ComFriend extends Friend {
	private String department;

	public ComFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("부서: " + department);
	}

}

public class SocialBookPM {
	public static void main(String[] args) {
		int cnt = 0;

		Friend[] frns = new Friend[10];
		

		// 모든 동창 및 동료의 정보 전체 출력
		frns[cnt++] = new UniFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UniFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new ComFriend("YOON", "R&D", "02-123-999");
		frns[cnt++] = new ComFriend("PARK", "Sales", "02-321-777");

		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // 오버라이딩 한 메소드가 호출된다.
			System.out.println();
		}

	}

}
