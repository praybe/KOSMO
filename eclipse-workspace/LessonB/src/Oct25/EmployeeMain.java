package Oct25;
//Polymorphism 연습하기

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee("YuJung", 28, "Seoul", "R&D");
		emp.printInfo();
		System.out.println();
		
		
		Regular rgl = new Regular("Jung", 29, "London", "Marketing");

		rgl.setSalary(1000); //순서 중요
		
		rgl.printInfo();

	}

}
