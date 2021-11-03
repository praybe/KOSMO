package Oct29;
//6번
import java.util.Scanner;

class Person {
	private String name, addr;
	private int age;

	public Person(String name, int age, String addr) {
		this.addr = addr;
		this.age = age;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println();
		System.out.println("주소 : " + addr);
	}

	/*
	 * 게터세터 쓰는건 선생님 서타일 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getAddr() { return addr; }
	 * 
	 * public void setAddr(String addr) { this.addr = addr; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 */

}

class Student extends Person {
	private String school, major;
	private int stuID;
	private double[] gpa = new double[8]; // 이거 여기에 안 씀 ..ㅠ

	// 우린 이걸 생성자라 부른다 ~
	public Student(String name, int age, String addr, String school, String major, int stuID) {
		super(name, age, addr);
		this.school = school;
		this.major = major;
		this.stuID = stuID;

	}

	@Override
	public void printInfo() {
		super.printInfo();

		/*선생님 방법은 게터세터 만들어서 이렇게 끌고 옴. 
		 * 이럴 경우 @Override 안씀 이 부분은 내 방법이 나음
		 * System.out.println("이름 : " + super.getName()); 
		 * System.out.println("나이 : " + super.getAge()); 
		 * System.out.println(); 
		 * System.out.println("주소 : " +super.getAddr());
		 */

		System.out.println("학교 : " + school);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + stuID);
	}

	public double averaege() {
		double sum = 0;
		double avg = 0;

		for (double d : gpa) {
			sum += d;
		}
		avg = sum / gpa.length;
		return avg;
	}

	// 게터세터 여기도 안만들어씀ㅇ ㅠㅜㅠ
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public double[] getGpa() {
		return gpa;
	}

	public void setGpa(double[] gpa) {
		this.gpa = gpa;
	}

	public void setGpa() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("8학기 성적을 입력해 주시기 바랍니다.");

			for (int i = 0; i < gpa.length; i++) {
				System.out.print((i + 1) + "학기 학점 → ");
				gpa[i] = sc.nextDouble();
			}
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			setGpa();// 재귀함수. 에러나면 자기자신 다시 호출
		}

	}

	/*내 방법. 이 부분은 선생님 방법이 훨씬 나음 
	 * public static void average() { 
	 * 
	 * Scanner sc = new Scanner(System.in); 
	 * System.out.println("8학기 성적을 입력해 주시기 바랍니다.");
	 * 
	 * double[] gpa = new double[8]; 
	 * double sum = 0; 
	 * 
	 * for (int i = 0; i < gpa.length;i++) { 
	 * System.out.print((i + 1) + "학기 학점 → "); 
	 * gpa[i] = sc.nextDouble(); 
	 * sum+= gpa[i]; 
	 * } double avg = sum / gpa.length;
	 * 
	 * System.out.println("8학기 총 평균 평점은 " + avg + "입니다.");
	 * }
	 */

}

public class GPA {
	public static void main(String[] args) {
		Student st = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산전보학과", 20132222);
		st.printInfo();
		System.out.println();

		// st.average();
		st.setGpa();

		System.out.println("8학기 총 평균 평점은 " + st.getGpa() + "입니다.");

	}

}
