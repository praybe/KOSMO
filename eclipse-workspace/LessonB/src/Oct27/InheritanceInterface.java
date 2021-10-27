package Oct27;

interface Printable {
	void print(String doc);
}

//인터페이스 간 상속도 extends로 표현
interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}

//기존 클래스 수정 불필요
class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}

//기존 클래스 수정 불필요
class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

//새로운 프린터 드라이버
class Prn909Drv implements ColorPrintable {
	@Override
	public void print(String doc) { // 흑백출력
		System.out.println("black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) { // 컬러출력
		System.out.println("CMYK ver");
		System.out.println(doc);
	}

}

public class InheritanceInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);

		System.out.println();
		prn.printCMYK(myDoc);

	}

}
