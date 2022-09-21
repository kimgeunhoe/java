package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineStreamOfFile {

	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		PrintWriter pwr = null;
		
		final String PATH_OUT = "outFileByLine.txt";
		System.out.println("파일 복사 시작");
		
		br = new BufferedReader(new FileReader("inFile.txt"));
		pwr = new PrintWriter(new FileWriter(PATH_OUT));
		
		String line = "";
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
			pwr.println(line);
		}
		System.out.println("텍스트 복사 완료");
		
		//Resource leaking(자원 누수 방지)
		if(br!=null) {
			br.close();
		}
		if(pwr!=null) {
			pwr.close();
		}
	}

}
