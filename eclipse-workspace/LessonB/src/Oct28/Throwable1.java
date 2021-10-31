package Oct28;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Throwable1 {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\java\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file); //IOException 발생 가능
			writer.write('A'); //IOException 발생 가능
			writer.write('z'); //IOException 발생 가능
			
			if(writer != null)
				writer.close();
			
		} catch(IOException e){
			e.printStackTrace();
			
		}
		//돌아가게 하려면 경로에서 simple.txt파일을 만들어 줘야 함

	}

}
