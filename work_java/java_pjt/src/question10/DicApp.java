package question10;

import java.util.Scanner;

//class dictionary{
//	String[] kor = {"사랑","아기","돈","미래","희망"};
//	String[] eng = {"love","baby","money","future","hope"};
//	String kor2Eng(String kor) {
//		return eng[i]
//	}
//}
public class DicApp {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("한영 단어 검색 프로그램입니다.");
//		while (true) {
//			System.out.print("한글 단어?");
//			String kor= scanner.next();
//			if(kor.equals("그만")) {break;}
//		}
//		String eng= dictionary.kor2Eng(kor);
//		if (eng == null) {
//			System.out.println(kor+"는 저의 사전에 없습니다.");
//		} else {
//			System.out.println(kor+"은 "+eng);
//		}
//		scanner.close();
//		
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("한글 단어?");
			String inputword=scanner.next();
			if(inputword.equals("그만")==true) {
				scanner.close();
				break;
			}
			switch (inputword) {
			case "희망":System.out.println(inputword+"은 hope");break;
			case "아기":System.out.println(inputword+"는 baby");break;
			case "사랑":System.out.println(inputword+"은 love");break;
			case "돈":System.out.println(inputword+"은 money");break;
			case "미래":System.out.println(inputword+"는 future");break;
			case "그만":break;
			default:System.out.println(inputword+"는 저의 사전에 없습니다.");break;
			}
		} while (true);
	}
}
