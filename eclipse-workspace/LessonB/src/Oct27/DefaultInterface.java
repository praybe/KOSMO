package Oct27;

interface Printable2 {
	void print(String doc);
	default void printCMYK(String doc) {} //디폴트 메소드
}

//기존 클래스 수정 불필요
class SPrinterDriver2 implements Printable2 {
	@Override
	public void print(String doc) {		
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}
//기존 클래스 수정 불필요
class LPrinterDriver2 implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

//새로운 프린터 드라이버
class Prn909Drv2 implements Printable2 {
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

public class DefaultInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		Printable2 prn = new Prn909Drv2();
		prn.print(myDoc);

		System.out.println();
		prn.printCMYK(myDoc);

	}

}
