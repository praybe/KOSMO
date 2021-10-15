//메인을 가진 애는 이렇게 따로 관리
package edu.kosmo.ex.main;

import edu.kosmo.ex.dept.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();
	

	}

}
