package Oct18;

public class SubString {

	public static void main(String[] args) {
		String st1 = "abcdefg";
		
		//2이상 부분 추출 컴터는 01234로 2는 3을 의미[
		String st2 = st1.substring(2);
		System.out.println(st2);
		
		//2이상 4미만 추출
		String st3 = st1.substring(2, 4);
		System.out.println(st3);

	}

}
