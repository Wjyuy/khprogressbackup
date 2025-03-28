package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/temp/output14.txt"); //업캐스팅
//		char[] data="홍길동3".toCharArray();
		String data="안녕 자바 프로그램";
//		writer.write(data);
		writer.write(data,3,2);//자바: "안녕 자바 프로그램"에서 인덱스3번에서 2글자를 읽어서 파일로 저장 
		
		writer.close();
	}
	
}
