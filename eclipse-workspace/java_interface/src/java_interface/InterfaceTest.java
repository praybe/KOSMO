package java_interface;
//Oct26 오전수업 마지막
//17장

interface Printable{ //class자리에 interface 
	public abstract void print(String doc);  //원리는 public abstract //중괄호가 없음. 형태가 조금 다르지
}

class Printer implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}

}

public class InterfaceTest {
	public static void main(String[] args) {
		Printable printable = new Printer();
		printable.print("Hello World");
		

	}

}
