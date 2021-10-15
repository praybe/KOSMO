package edu.kosmo.ex.dept;
//클래스 만들고
public class Employee {
	
	//변수 선언하고
	private String name;
	private int age;
	private String addr;
	private String dept;
	
	
	//생성자 선언
	public Employee(String name, int age, String addr, String dept) {
		this.name=name;
		this.age=age;
		this.addr=addr;
		this.dept=dept;
		
	} 
	
	//함수는 특별한 이유가 없으면 public
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + addr);
		System.out.println("부서: " + dept);
		
	}
	



}
