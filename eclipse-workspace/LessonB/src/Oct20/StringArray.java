package Oct20;

//13장. 값의 저장과 참조의 예

class Box{
	private String conts;
	
	Box(String cont){ this.conts = cont;}
	public String toString() { //철자 틀렸더니 잘못나옴
		return conts;
	}

}

public class StringArray {
	public static void main(String[] args) {
		Box[] ar = new Box[3];
		
		// 배열에 인스턴스 저장
		ar[0] = new Box("First");
		ar[1] = new Box("Second");		
		ar[2] = new Box("Third");
		
		// 저장된 인스턴스의 참조
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		

	}

}
