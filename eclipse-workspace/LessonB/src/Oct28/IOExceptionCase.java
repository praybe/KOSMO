package Oct28;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase {
	public static void main(String[] args) throws IOException {
		
		md1();
	}
		
		public static void md1() throws IOException {
	
		md2();
		}
		
		public static void md2() throws IOException{ //throws 뒤에는 예외객체를 입력한다.
			//즉 이 함수 안에서 문제가 생기게 되면 throws IOException을 jvm이 던져준다고 그러면
			//md2를 호출한 놈한테 던져줄거라는 것.
			//책임전가를 나를 호출한 함수로 던지겠다는 것. md2는 누가 호출했다? md1이. 그러니 체크는 md1이 해라.
			//checked 에러유형은 반드시 try catch로 막던지, throws 하면 되는데 md2도 throws해서 책임전가 가능
			//md2가 책임전가하면 결국 main으로 가는데 main이 해결해야 함 ㅋㅋ 
			//그러고 md1도 throw가능. 그럼 누가 main을 호출했지? jvm이 호출함. jvm 니가 해결해 ㅡㅡ  => 에러 해결 안할거라는거 ㅋㅋㅋㅋㅋ
			// 실무에서는 그래서 이거 안함. 반드시 try catch로 막아 줌. 
			// 빨리 테스트 확인할겨. trycatch 귀찬헝. 그럴떄 씀.
			
			
			Path file = Paths.get("C:\\java\\Simple.txt");
			BufferedWriter writer = null;
			
				writer = Files.newBufferedWriter(file); //IOException 발생 가능
				writer.write('A'); //IOException 발생 가능
				writer.write('z'); //IOException 발생 가능
				
				if(writer != null)
					writer.close();
				
			
	

	}

}
