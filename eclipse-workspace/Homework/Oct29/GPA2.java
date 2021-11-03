package Oct29;
public class GPA2 {
	public static void main(String[] args) {
		Student2 st = new Student2("김다정", 20, "서울시 관악구", "동양서울대학교", "전산전보학과", 20132222);
		st.printInfo();
		System.out.println();

		st.setGpa();
		System.out.println("8학기 총 평균 평점은 " + st.averaege() + "입니다.");

	}

}
