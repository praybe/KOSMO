package Oct25_PMpractice;

//2번, 2-1번
//참고 LessonB
public class Regular extends Employee {

	public Regular(String name, int age, String addr, String dept) {
		super(name, age, addr, dept);

	}

	public void setSalary(int sal) {
		super.salary = sal;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("정규직 월급: " + super.salary);

	}

}
