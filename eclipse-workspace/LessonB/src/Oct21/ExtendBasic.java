package Oct21;
//14장 상속 extend

class Man {
	String name;
	
	Man(String name){
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("my name is " + name);
	}

}

//Man 클래스를 좀 더 넓히겠다.
class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {
		super(name); //부모에 있는 생성자 호출 Man(String name){this.name = name;}
		
		this.company = company;
		this.position = position;
	}

	public void tellYouInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}

}

public class ExtendBasic {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("Avery", "Hybrid ElD", "Staff Eng.");

		man.tellYourName();

	}

}
