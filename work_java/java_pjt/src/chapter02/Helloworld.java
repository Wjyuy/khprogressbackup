package chapter02;
/*
 * 
 * 작성일: 2025-02-12
 * 작성자: 홍길동
 * 내용 :Helloworld 클래스로 문자열 출력
 * 
 */

//jvm : 자바 가상 기계
//jvm 이 public class를 찾아감 1
//jvm 이 main 메소드를 찾아감 2
public class Helloworld {
	public static void main(String[] args) {
//		String=문자열 타입
//		message= 변수(명)
//		String message; //변수 선언
//		message="헬로 월드!"; //변수값 할당
		
		String message ="헬로 월드!"; //선언과 동시에 초기화
		System.out.println(message);
		message="웰컴 투헬!"; 
//		syso 치고 ctrl+space ->System.out.println();
		System.out.println(message);
	}
}
