package Oct29;
import java.util.Scanner;

class Student2 extends Person2 {
	private String school, major;
	private int stuID;

	private double[] gpa = new double[8];

	// 우린 이걸 생성자라 부른다 !
	public Student2(String name, int age, String addr, String school, String major, int stuID) {
		super(name, age, addr);
		this.school = school;
		this.major = major;
		this.stuID = stuID;

	}

	@Override
	public void printInfo() {
		super.printInfo();
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
			System.out.println("잘못된 입력입니다. 다시 입력해 주시기 바랍니다.");
			setGpa();// 재귀함수. 에러나면 자기자신 다시 호출
		}

	}

}

