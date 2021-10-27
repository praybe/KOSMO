package Oct27;
//어떻게 손대야 할지 모르겠음 ㅋㅋㅋ ㅠㅠ 
interface Printable3 {
	static void printLine(String str){
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc); //인터페이스의 static 메소드 호출
	}
}

//기존 클래스 수정 불필요
class SPrinterDriver3 implements Printable3 {
	@Override
	public void print(String doc) {		
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}
//기존 클래스 수정 불필요
class LPrinterDriver3 implements Printable3 {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

//새로운 프린터 드라이버
class Prn909Drv3 implements Printable3 {
	@Override
	public void print(String doc) {			//흑백출력
		System.out.println("black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {		//컬러출력
		System.out.println("CMYK ver");
		System.out.println(doc);
	}

}

public class StaticInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		Printable3 prn = new Prn909Drv3();
		prn.print(myDoc);

		System.out.println();
		prn.printCMYK(myDoc);

	}

}
