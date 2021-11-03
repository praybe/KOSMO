package Oct29;
public class Person2 {
	private String name, addr;
	private int age;

	public Person2(String name, int age, String addr) {
		this.addr = addr;
		this.age = age;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println();
		System.out.println("주소 : " + addr);
	}

}
