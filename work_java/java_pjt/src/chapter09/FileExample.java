package chapter09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir= new File("C:/aaa");
		File dir= new File("C:/aaa/bbb"); //하위 디렉토리 포함
		File file1= new File("C:/aaa/file1.txt");//파일
		File file2= new File("C:/aaa/file2.txt");//파일
		File file3= new File("C:/aaa/file3.txt");//파일
		
//		dir.mkdir(); //디렉토리 만들기
		dir.mkdirs();//하위 디렉토리 같이 만들기
		file1.createNewFile(); //파일 만들기
		file2.createNewFile(); //파일 만들기
		file3.createNewFile(); //파일 만들기
		
		File test=new File("c:/aaa"); //디렉토리 정보를 가지고 test 객체생성
		File[] contents= test.listFiles();//디렉토리 정보를 가지고 온다.(하위디렉토리들+파일들)
		System.out.println("   날짜       시간      형태          크기       이름");
		System.out.println("-----------------------------------------------------------------------");
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");//년월일 오전/오후 시분(내가정한다)
		
		for (int i = 0; i < contents.length; i++) {
//			1740385760864:1970년 01월 01일 기준 오늘까지 milisec(1/1000초)로 계산된 값(longtype)
//			System.out.print(contents[i].lastModified()); //마지막 생성일자
			
//			Mon Feb 24 17:29:20 KST 2025
//			System.out.print(new Date(contents[i].lastModified()));  
			System.out.print(sdf.format(new Date(contents[i].lastModified())));  
			
			if (contents[i].isDirectory()) {//디렉토리이면
				System.out.println("\t<DIR>\t\t"+contents[i].getName()); 
			} else {
//				contents[i].length() :파일 크기 
//				contents[i].getName() : 디렉토리나 파일 이름  
				System.out.println("\t\t\t"+contents[i].length()+"\t"+contents[i].getName());  
			}
		}
	}
}
