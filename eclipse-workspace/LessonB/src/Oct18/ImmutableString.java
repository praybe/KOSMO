package Oct18;

public class ImmutableString {
	public static void main(String[] args) {
		
		String str1 = "Simple String";
		String str2 = "Simple String";
		// == 참조변수의 참조 값 비교
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		// == 참조변수의 참조 값 비교
		if(str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		
		//엄연히 주소가 달라서 다르다고 뜸
		if(str1 == str3)
			System.out.println("str1과 str3는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str3는 다른 인스턴스 참조");
		
		if(str1.equals(str4))
			System.out.println("같은 글자 입니다.");
		else
			System.out.println("다른 글자 입니다.");
		
		
		
		
		String str5 = "simple String";
		String str6 = "Simple String";	
		//대소문자도 다른거
		if(str5 == str6)
			System.out.println("str5과 str6는 동일 인스턴스 참조");
		else
			System.out.println("str5과 str6는 다른 인스턴스 참조");
	
		
		
		String str7 = str1 + str2 ;  //문자열끼리 더하기
		System.out.println(str1);
		System.out.println(str7 == str1);
		
		System.out.println(str2);
		System.out.println(str7 == str2);
		
		

		
	}

	
}
