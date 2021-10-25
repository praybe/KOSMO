package Oct19;

class Box{
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	
	@Override  //<< 원래는 이거 붙여주는게 맞음
	public String toString() {
		
		return conts; //문자열 반환
		
		//System.out.println("누군가 호출하고 있다");
		//return"Camera";
		
		
	}	
}

public class AutoCallToString {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb); //stb라는 객체를 넣었음
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		
		//box = null; //메모리와 관계를 끊는다.
		
		System.out.println(box);

		

	}
}
