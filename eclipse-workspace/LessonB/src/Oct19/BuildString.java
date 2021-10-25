package Oct19;

public class BuildString {

	public static void main(String[] args) {
		//문자열 "123"이 저장된 인스턴스의 생성
		StringBuilder stbuf = new StringBuilder("123");
		
		//문자열 덧붙이기
		stbuf.append(45678);
		System.out.println(stbuf.toString());
		//12345678
		
		//문자열 일부 삭제
		stbuf.delete(0, 2);
		System.out.println(stbuf.toString());
		//345678
		
		//문자열 일부 교체
		stbuf.replace(0, 3, "AB");
		System.out.println(stbuf.toString());
		//AB678
		
		//문자열 내용 뒤집기
		stbuf.reverse();
		System.out.println(stbuf.toString());
		//876BA
		
		//일부만 문자열로 반환
		String sub = stbuf.substring(2, 4);	
		System.out.println(sub);
		//6B
	
		

	}

}
