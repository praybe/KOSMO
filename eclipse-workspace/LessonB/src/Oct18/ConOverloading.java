package Oct18;
//생성자의 오버로딩을 통해 생성되는 인스턴스의 유형을 구분할 수 있다.
// 여권이 있는 사람과 없는 사람
// 운전 면허증을 보유한 사람과 보유하지 않은 사람
class Person {
	private int regiNum; //주민등록 번호
	private int passNum; //어권 번호
	
	Person(int regiNum, int pnum){
		this.regiNum = regiNum; 
		passNum = pnum;
		
	}
	
	Person(int rnum){
		//regiNum = rnum;
		//passNum = 0;
		this(rnum, 0);
		
	}
	

	
	void showPersonalInfo() {
		
		System.out.println("주민등록 번호: " + regiNum);
		
		if(passNum != 0)
			System.out.println("여권 번호: " + passNum + '\n');
		else
			System.out.println("여권을 가지고 있지 않습니다. \n");
				
		
	}
	
}
	
	
	
public class ConOverloading {
	public static void main(String[] args) {
		//여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);
		
		//여권 없는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
		
		
	}
}
