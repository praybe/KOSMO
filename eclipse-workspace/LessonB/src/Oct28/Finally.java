package Oct28;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Finally {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\java\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file); 
			writer.write('A');
		} catch (IOException e) {  
			// TODO: handle exception
			e.printStackTrace();
		}
		
		 //에러유무 불문 finally 탐
		finally { //코드의 실행이 try안으로 진입하면, 무조건 실행된다.
			// TODO: handle finally clause
		try {
			if(writer != null)
				writer.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
			
		}
		
		

	}

}
