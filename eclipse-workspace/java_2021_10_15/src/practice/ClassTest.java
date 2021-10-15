package practice;


//1.공유변수, 클래스 변수, 정적 변수, static 변수
//2.static은 메모리에 먼저 올라간다. (가장 중요 point!!)
//3.static 변수는 메모리에 한 번만 올라감
//4. 객체들이 공유를 함. (공유된 공간에 하나만 잡힘)
class ClassVar {
	static int instNum = 0;
	
	public ClassVar() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}


class ClassTest {	
	public static void main(String[]args) {		
		//InstCnt.instNum;
		System.out.println(ClassVar.instNum++);
		
		
		ClassVar cnt1 = new ClassVar();
		ClassVar cnt2 = new ClassVar();
		ClassVar cnt3 = new ClassVar();
		
	}
}





