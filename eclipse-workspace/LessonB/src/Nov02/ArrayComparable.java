package Nov02;
//ArrayClass 6

//Comparable, compareTo

import java.util.Arrays;

//자바에서 객체를 정렬시키고 싶음
//그럴때 implments comparable
class Person implements Comparable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		// return this.age - p.age; //오름차순, 자기자신 기준으로 하면
		// return p.age - this.age; //내림차순, 상대방을 기준으로 하면
		
		// return p.name.length() - this.name.length(); //이름의 갯수 순서대로 정렬
		
		//사전순 정렬 lexicographically
		return name.compareTo(p.name);
		//return p.name.compareTo(this.name); 선생님 방법


	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

}

public class ArrayComparable {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Jake", 29);
		ar[1] = new Person("Avery", 15);
		ar[2] = new Person("Elizabeth", 37);

		// 여기서 정렬 구분이 들어감
		Arrays.sort(ar);
		for (Person p : ar)
			System.out.println(p);
		System.out.println();

		System.out.println(Arrays.toString(ar));

	}

}
