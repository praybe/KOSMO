package Nov01;

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) { // 형변환 가능한지 묻는 것

			Person person = (Person) obj;
			if (this.name.equals(person.name)) {
				return true;
			}
		}
		return false;
	}
}

public class Question4 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
						// equals를 오버라이딩 하지 않으면 주소값끼리 비교한다.
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최명태")));

	}

}
