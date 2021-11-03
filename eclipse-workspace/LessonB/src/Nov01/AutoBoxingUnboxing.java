package Nov01;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {

		String str = "ABCD" + "가나다라마바사";
		String str2 = new String("String"); // 배열이 옴
		System.out.println(str);
		System.out.println(str2);

		// ===============================

		Integer num = 10;
		num++; // new Integer(new.intValue()+1);
		System.out.println(num); // 오토 박싱과 오토 언박싱 동시 진행

		num += 3; // new Integer(new.intValue()+1-3)
		System.out.println(num); // 오토 박싱과 오토 언박싱 동시 진행

		int r = num + 5;
		Integer rObj = num - 5;

		System.out.println(r);
		System.out.println(rObj);

	}

}
