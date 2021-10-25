package Oct25;
//Polymorphism 연습하기

public class Regular extends Employee {

	public Regular(String name, int age, String address, String dept) {
		super(name, age, address, dept);
	}

	/*public int getSalary() {
		return salary;
	}*/

	public void setSalary(int sal) {
		super.salary = sal;

	}

	public void printInfo() {
		super.printInfo();
		System.out.println("정규직 월급: " + super.salary);

	}

}
