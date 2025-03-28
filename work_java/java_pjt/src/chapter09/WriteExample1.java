package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl+shift+o
public class WriteExample1 {
	//FileOutputStream : 바이트 단위 출력을 위한 하위 스트림 클래스
	//FileOutputStream output.txt 를 가지고 객체 생성한다.
	public static void main(String[] args) throws Exception {
//		OutputStream os=new FileOutputStream("C:\\temp\\output.txt");//upcasting
//		백 슬래시 대신 슬래스 사용가능!  (특수문자 아니라서)
		OutputStream os=new FileOutputStream("C:/temp/output2.txt");
		//바이트 단위로 문자열을 읽는다.
		byte[] data = "ABC".getBytes();
		
		for (int i = 0; i < data.length; i++) {
//			FileOutputStream 객체에 바이트 배열원소를 넣는다.
			os.write(data[i]);
		}
		os.close();
	}
	
}
