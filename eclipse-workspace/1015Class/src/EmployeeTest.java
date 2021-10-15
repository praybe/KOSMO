class Employee{
	
	private String name, address, team;
	private int age;
	
	Employee(String name, int age, String address, String team){   //순서 잘 지키셈.. 밑에 오류 났었음 .
		this.name=name;
		this.address=address;
		this.age=age;
		this.team=team;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name+'\n'+"나이 : "+age+'\n'+"주소 : "+address+'\n'+"부서 : "+team);
		
	}		
}



public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();
	}
}

