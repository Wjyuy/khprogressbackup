package chapter02;

public class LongExample {
	public static void main(String[] args) {
		long var1=10;
//		기본 타입 int로 인식되서 범위를 벗어남
//		오류: The literal 10000000000 of type int is out of range 
//		long var2=10000000000;
		
//		long타입은 대소문자 표기 가능하다. but 대문자가 더 선호됨
		long var2=10000000000L;
//		long var2=10000000000l;
//		오류: The literal 10000000000000000000L of type long is out of range
//		long var3=10000000000000000000L;
	}
}
