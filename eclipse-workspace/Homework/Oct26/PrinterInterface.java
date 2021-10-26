package Oct26;

//4¹ø
public class PrinterInterface {
	public static void main(String[] args) {
		String myDoc = "This is a report about..";

		// »ù¼þ ÇÁ¸°ÅÍ
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// ¿¤Áö ÇÁ¸°ÅÍ
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
