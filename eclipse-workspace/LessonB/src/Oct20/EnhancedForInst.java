package Oct20;

class Box1 {

	private String contents;
	private int boxNum;

	public Box1(int boxNum, String contents) {
		this.boxNum = boxNum;
		this.contents = contents;
	}

	public int getBoxNum() { // int가 아니라 String으로 해서 안나오고 있었음 ㅋ ㅠㅠ
		return boxNum;

	}
	
	//세터 없어도 되는 건 맞음. 그러나 현업에서는 무조건 게터 세터 넣고 감.
	//왜냐? 고객님이 뭘 사용할지 모르니까!
	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}

	public String toString() {
		return contents;
		//return contents + boxNum;
	}

}

public class EnhancedForInst {
	public static void main(String[] args) {

		Box1[] ar = new Box1[5];
		ar[0] = new Box1(101, "Coffee");
		ar[1] = new Box1(202, "Computer");
		ar[2] = new Box1(303, "Apple");
		ar[3] = new Box1(404, "Dress");
		ar[4] = new Box1(505, "Fairy-tale book");

		// 배열 요소 전체 출력
		for (Box1 e : ar) {
			//게터함수 만드는 방법: 게터함수 + 변수명
			if (e.getBoxNum() == 505)
				System.out.println(e); //내부적으로 toString을 호출하게 되어있음. 그래서 위에다가 toString함수를 만든 것.
		}
	}

}
