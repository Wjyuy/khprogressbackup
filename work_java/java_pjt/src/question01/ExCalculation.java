package question01;

import java.util.Scanner;

//class 여러개 사용해도 무관
class Aaa{}
class Baa{}
//public class Caa{} : public class 가 자바파일 안에 두개이상 존재시 오류!
//1.JVM이 수많은 class에서 public class를 찾아감
public class ExCalculation {
	public static void aaa(){
		System.out.println("777");
	}
	public static void bbb(){
		System.out.println("777");
	}
//	2.JVM이 수많은 메소드에서 main메소드를 찾아감
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 실수 입력>>");
		double x=scanner.nextDouble();
		int y=scanner.nextInt();
		System.out.println("두수의 덧셈은 "+(x+y));
		System.out.println("두수의 뺄셈은 "+((x>y)?(x-y):(y-x)));
		System.out.println("두수의 곱셈은 "+(x*y));
		System.out.println("두수의 나눗셈은 "+((x>y)?(x/y):(y/x)));
		
		scanner.close();
	}
}
