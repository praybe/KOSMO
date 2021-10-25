package Oct25;
//Polymorphism 연습하기

public class Employee {
	
	// Employee만 뽑을 땐 접근제한자private
	// Regular도 뽑을 땐 접근제한자 protected
	private String name, address, dept;
	private int age;
	protected int salary;

	public Employee(String name, int age, String address, String dept) {
		this.address = address;
		this.age = age;
		this.name = name;
		this.dept = dept;
	}

	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("부서: " + dept);

	}

}
