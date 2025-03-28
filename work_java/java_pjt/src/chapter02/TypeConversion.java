package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=10;
		
//		연산 결과는 큰타입으로 int
		System.out.println(b+i);
//		정수 기본타입 int로 연산
		System.out.println(10/4);
//		실수 큰타입으로 계산됨( double/int )
		System.out.println(10.0/4);
//		실수 연산으로 결과는 실수
		System.out.println(2.9+1.8);
//		2+1.8 = 3.8 
		System.out.println((int)2.9+1.8);
//		2+1 = 3
		System.out.println((int)2.9+(int)1.8);
//		2.9+1.8 = 4.7을 int로 변환 = 4
		System.out.println((int)(2.9+1.8));
	}
}
