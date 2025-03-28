package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample13 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/temp/output13.txt"); //업캐스팅
		char[] data="홍길동3".toCharArray();
//		writer.write(data);
		writer.write(data,1,2); //길동. "홍길동3" 1번인덱스부터 2글자
		
		writer.close();
	}
	
}
