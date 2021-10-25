package Oct25_PMpractice;

//2번, 2-1번
//참고 LessonB
public class EmployeeMain {
	public static void main(String[] args) {

		Employee emp = new Employee("John Doe", 43, "LasVegas", "Call center");
		emp.printInfo();

		System.out.println();

		Regular rgr = new Regular("Her Mejasty the Queen", 99, "England", "Royal Windsor Castle");
		rgr.setSalary(1000000);
		rgr.printInfo();

	}

}
