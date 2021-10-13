
class A{	
	int num;
	
	//n이 10을 받게 되면 num에 10을 세팅한다. 그럼 num값이 10되어 메모리로 올라감
	void setNum(int n) { 
		num =n;
	}
	
	//반드시 void가 아니라 int. 왜내면 int num을 받아올거임. 왜냐. 내가 num 얼마를 넣었는지 가물가물할때 사용
	int getNum(){
		return num;
	}
	
	void printNum() {
		System.out.println(num); //(2)
	}
}


public class ObjTest {
	public static void main(String[] args) {
		
		A a; 
		a = new A();  //변수선언
		
		//a.num = 10;
		a.setNum(10);
		int num = a.getNum();
		a.printNum(); //출력이 10이 되도록 > num값을 뿌리는 함수를 만들어라 (1)
		
		//a.num = 10; 
		//a.num = 20; //가지고 있는 변수에 객체대입
		
		//System.out.println(a.num);
		
	}
}


