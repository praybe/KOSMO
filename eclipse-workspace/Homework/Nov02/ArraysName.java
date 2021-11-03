package Nov02;

import java.util.Arrays;

class Person implements Comparable {
	private int age;
	private String name;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		return p.name.length() - this.name.length(); 
	}

	public String toString() {
		return name + ": " + age;
	}

}

public class ArraysName {
	public static void main(String[] args) {

		Person[] ar = new Person[3];
		ar[0] = new Person("Lee11", 29);
		ar[1] = new Person("Goo111", 15);
		ar[2] = new Person("Soo1111", 37);

		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));

	}

}
