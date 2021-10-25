package Oct21;


class SuperClass {
	protected static int count = 0; //클래스 변수
	
	public SuperClass() {
		count++; //클래스 내에서는 직접 접근이 가능
		System.out.println("호출됨");
	}	
}

//SubCLS obj3 = new SubCLS();
//obj3.showCount();
class SubClass extends SuperClass { //일단 상속을 받게되면 부모에 있는 것을 메모리에 올림. 생성자를 반드시 호출
	
	public SubClass() {
		super(); //★★★컴파일러가 넣어준다. 그래서 count++이 3이 되어서 호출됨
	}
	public void showCount() {
		System.out.println(count); //상위 클래스에 위치하는 클래스 변수에 접근
	}
} //그러나 하위 클래스에서 이름만으로 접근 가능! 접근 수준 지시자에게 허용한다면 !

class ForInFor{
	public static void main(String[] args) {
		
		SuperClass obj1 = new SuperClass();
		SuperClass obj2 = new SuperClass();
		SubClass obj3 = new SubClass();
		
		obj3.showCount();
		

	}

}
