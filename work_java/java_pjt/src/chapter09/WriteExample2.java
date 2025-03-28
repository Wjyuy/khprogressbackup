package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl+shift+o
public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os=new FileOutputStream("C:/temp/output3.txt");
		byte[] data = "DEF".getBytes();
		os.write(data); //배열을 지원하므로 반복문 없어도 된다
		
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
		os.close();
	}
	
}
