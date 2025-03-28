package chapter02;

public class Square {
	public static void main(String[] args) {
		int n=4;
//		square(); //메소드 호출부
//		int s= square(); //square(int length) 정의부의 파라미터가 입력되지 않아 오류 
		int s= square(n); 
//		System.out.println(s);
		System.out.println("한 변의 길이가 "+n+"인 정사각형의 넓이: "+s);
	}
//	square: 메소드 명
//	int: 리턴(반환)타입
//	int length :int 타입의 매개변수(인자,파라미터,입력변수)
//	public static int square(int length) {
	
//	void : 리턴 타입이 없음
//	public static void square() { //메소드 정의부
//		return; //생략 가능(void 일 때)
	
//	오류발생: return 문 사용 or 타입 void 사용해야 해결 가능   
//	public static int square() {
//		return ""; //타입 불일치시 오류(String)
//		return 0; 
	public static int square(int length) { //n->length로 받음
		return length*length;
	}
}
