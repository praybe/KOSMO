


//공유변수, 클래스 변수, 정적 변수, static 변수
//static은 메모리에 먼저 올라간
class InstCnt {
	static int instNum = 0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}


class ClassVar {	
	public static void main(String[]args) {
		
		//InstCnt.instNum;
		System.out.println(InstCnt.instNum);
		
		
		//InstCnt cnt1 = new InstCnt();
		//InstCnt cnt2 = new InstCnt();
		//InstCnt cnt3 = new InstCnt();
		
	}
}





