package Nov01;

class Wrapper {
	public static void showData(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {

		int num = 10;
		Integer intObj = new Integer(num); // toString이 함수오버라이딩 되어서 Integer에서 3을 뿌림
		showData(intObj);

		double dou = 10;
		dou = intObj.doubleValue();

		short sh = (short) num;
		sh = intObj.shortValue();

		// 실수 7.15로 채워진 래퍼 인스턴스 생성
		showData(new Double(7.15));

	}

}
