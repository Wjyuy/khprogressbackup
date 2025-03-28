package chapter03;
/*
 * do while문
 * a~z 알파벳 소문자 출력
 * */
public class DoWhileSample {
	public static void main(String[] args) {
		char c='a';
		
		do {
//			abcdefghijklmnopqrstuvwxyz
			System.out.print(c);
			
//			Type mismatch: cannot convert from int to char
//			c=c+1;
			
//			유니코드 변환해서 1증가한 유니코드가 문자로 변환해서 변수c에 저장 
//			c+1 => 문자 + 정수 = 정수 
//			c=(char)(c+1);
			c+=1; //c=c+1 자동 변환
//			c++; //자동 변환
		} while (c<='z');
	}
}
