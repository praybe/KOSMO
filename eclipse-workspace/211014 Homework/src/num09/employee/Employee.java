package num09.employee;


class Employee {
	
	String name;
	int age;
	String address;
	String team;
	
	Employee(String name, int age, String address, String team){
		this.address=address;
		this.age=age;
		this.name=name;
		this.team=team;
	}

	void printlnfo() {
		System.out.println("이름 : " + name + '\n' + "나이 : " + age+ '\n' +"주소 : "+address+ '\n'+"부서 : " + team);
		
	}
	

	

	
	
	


}
