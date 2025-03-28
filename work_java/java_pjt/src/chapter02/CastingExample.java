package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue=44032;
//		int 타입을 char로 바로 저장하려고 하면 오류
//		Type mismatch: cannot convert from int to char
//		char charValue=intValue;
		
//		char 로 변환(casting)해서 저장
//		44032유니코드에 해당하는'가'문자가 저장
		char charValue=(char)intValue;
		System.out.println(charValue);
		
//		long longValue=500;
//		Type mismatch: cannot convert from long to int
//		큰거에서 작은거 변환 안 됨
//		intValue = longValue;
//		정수 큰 타입에서 작은 타입으로 변환(안하면 오류) (int)
		
//		범위를 벗어남: The literal 5000999888 of type int is out of range 
//		long longValue=5000999888;//L 안 붙이면 int 인식되는 오류 
		long longValue=5000999888L;
//		long타입 숫자가 int로 변환될때 잘려서 706032592로 저장
		intValue =(int)longValue;
		System.out.println(intValue);
		
//		실수에서 정수로 변환(int) 안하면 오류 
		double doubleVaule=3.14;
		intValue=(int)doubleVaule;
//		3.14에서 소수점이 잘려서 3으로 저장
		System.out.println(intValue);
	}
}
