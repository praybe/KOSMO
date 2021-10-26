package Oct26;
//오후수업
//interface해서 MS OS가 강제함.
//Print 제작사들은 저 안에서 돌아가도록 짜는 것.  
//겉 껍데기 print는 맞춰줘야 해. 규약, 표준이라고 함
//사용방법은 polyMorphism적용. 함수오버라이딩 활용하기 위해서 
interface Printable {
	public void print(String doc);
}

class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}

class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

public class PrintInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);

		System.out.println();

		// 삼성 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
