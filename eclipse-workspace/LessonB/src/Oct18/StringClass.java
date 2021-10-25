package Oct18;

public class StringClass {
	//함수 오버 로딩 = 우리가 쓰는 가장 대표적인 함수 println함수
	public static void main(String[] args) {
		String str1 = new String ("Simple String");
		String str2 = "The Best String";
		
		//println 메소드가 다양한 인자를 전달받을 수 있는 이유는 메소드 오버로딩
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(13);  //'개 행'
		System.out.println(3.14);
		System.out.println('A');
		System.out.println();
		
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();
		
		showString("Funny String");

	}
	
	public static void showString(String str) {
		
		System.out.println(str);
		System.out.println(str.length());
		
	}

	
}
