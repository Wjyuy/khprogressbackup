package chapter02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
//		0b~ : 이진수
//		1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 = 0b1011를 10진수로 계산
		int var1=0b1011;
//		0~: 8진수
//		2*8^2 + 0*8^1 + 6*8^0
		int var2=0206;
//		10진수
		int var3=365;
//		16진수
//		11*16^1 + 3*16^0
		int var4=0xB3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}
